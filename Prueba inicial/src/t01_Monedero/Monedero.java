package t01_Monedero;

public class Monedero {
	/*
	* La clase MonederoSupremo controla 5 tipos de monedas:
	* 5,10,20,50,100 cts.
	* los servicios son:
	* Añadir moneda
	* Si hay suficiente dinero
	* 	==> ¿Cómo no va a haber dinero si le estás metiendo ya más dinero de lo que va a devolver?
	* Si puedo devolver el cambio
	* Hacer el cambio 
	* Retornar dinero
	*/
	
	private final int[] valorMonedas = new int[]{1, 2, 5, 10, 20, 50, 100, 200};
	private int[] monedas = new int[this.valorMonedas.length];
	public final int[] VALOR_MONEDAS = valorMonedas;
	
	public Monedero(int[] monedas){
		for(int i=0; i<monedas.length && i<this.monedas.length; i++)
			this.monedas[i] = monedas[i];
	}
	
	public void aniadirMoneda(int valor, int cantidad){
		int moneda = comprobarValor(valor);
		
		System.out.println("--[Añadir]----------");
		
		if(moneda != -1){
			System.out.printf("Valor:%1$14s\n", this.valorMonedas[moneda]);
			System.out.println("Cantidad");
			System.out.printf("  Anterior:%1$9s\n", this.monedas[moneda]);
			System.out.printf("  Actual:  %1$9s\n", (this.monedas[moneda] += cantidad));
		}else
			System.out.printf("Valor no válido:%1$4s\n", valor);
		
		System.out.println("--------------------\n");
	}

	private void aniadirMonedas(Monedero monedero) {
		for(int i=0; i<this.monedas.length; i++)
			this.monedas[i] += monedero.numeroMonedas(valorMonedas[i]);		
	}
	
	public boolean pagar(int precio, int[] monedas){
		Monedero monedasIntroducidas = new Monedero(monedas);
		Monedero cambio;
		
		aniadirMonedas(monedasIntroducidas);

		System.out.println("--[Pagar]-----------");
		System.out.printf("%1$12s%2$8s\n", "Importe", precio);
		System.out.printf("%1$12s%2$8s\n", "Dinero", monedasIntroducidas.valorTotal());
		System.out.println("--[Cambio]----------");
		
		if((cambio = comprobarCambio(precio, monedasIntroducidas)) == null)
			System.out.println("Cambio insuficiente");
		else
			System.out.println(cambio.devolverCambio());

		System.out.println("--------------------\n");
		
		return false;
	}

	public int numeroMonedas(int valor){
		int moneda = comprobarValor(valor);
		
		if(moneda == -1) return 0;
		
		return this.monedas[moneda];
	}
	
	public String devolverCambio(){
		String content = "";
		
		for(int valor : valorMonedas)
			if(numeroMonedas(valor) != 0)
				content += String.format("%1$8s  =>%2$8s\n", valor, numeroMonedas(valor));
		
		content += "--------------------\n";
		content += String.format("%1$12s%2$8s", "Total", this.valorTotal());
		
		return content;
	}
	
	public String toString(){
		String content = "";
		
		content += "--[Monedero]--------\n";
		
		for(int valor : valorMonedas)
			content += String.format("%1$8s  =>%2$8s\n", valor, numeroMonedas(valor));
		
		content += "--------------------\n";
		content += String.format("%1$12s%2$8s\n", "Total", this.valorTotal());
		content += "--------------------\n";
		
		return content;
	}
	
	private int comprobarValor(int valor){
		int index = 0;
		for(int valorMoneda : valorMonedas){
			if(valorMoneda == valor)
				return index;
			index++;
		}
		
		return -1;
	}
	
	private Monedero comprobarCambio(int precio, Monedero monedas) {
		int devolucion = monedas.valorTotal() - precio;
		int[] devolverMonedas = new int[this.monedas.length];
		Monedero cambio;
		
		if(devolucion < 0) return null;
		
		for(int i=this.monedas.length-1; i>=0; i--){
			int numeroMonedas = (int) devolucion / this.valorMonedas[i];
			
			if(numeroMonedas > this.numeroMonedas(this.valorMonedas[i]))
				numeroMonedas = this.numeroMonedas(this.valorMonedas[i]);
			
			devolucion -= numeroMonedas * this.valorMonedas[i];
			devolverMonedas[i] = numeroMonedas;
		}
		cambio = new Monedero(devolverMonedas);
		
		if(devolucion == 0)
			return cambio;
		return null;
	}
	
	public int valorTotal(){
		int total = 0;

		for(int valor : valorMonedas)
			total += valor * numeroMonedas(valor);
		
		return total;
	}
}
