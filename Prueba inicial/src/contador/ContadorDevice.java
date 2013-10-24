package contador;

public class ContadorDevice {
	// Atributos
	private int valorActual;
	private int valorInicial;
	
	// Constructor
	public ContadorDevice(){
		this.valorActual = 0;
		this.valorInicial = 0;
	}
	// Constructor con atributos
	public ContadorDevice(int manuel){
		this.valorActual = manuel;
		this.valorInicial = 0;
	}
	public ContadorDevice(int valorActual, int valorInicial){
		this.valorActual = valorActual;
		this.valorInicial = valorInicial;
	}
	
	// Accesadores	
	public int getValorActual() {
		return valorActual;
	}
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	public int getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}

	// Servicios
	public String toString(){
		String mensaje = "Valor actual: ";
		mensaje += this.valorActual;
		return mensaje;
	}
	public void incrementar(){
		this.valorActual++;
	}
	public void decrementar(){
		this.valorActual--;
	}
	public void resetar(){
		this.valorActual = this.valorInicial;
	}

	public static void main(String[] args) {
		// Instanciar el objeto de la clase
		ContadorDevice contador = new ContadorDevice(6, 10);
		System.out.println(contador);
		contador.setValorActual(5);
		System.out.println(contador);
		contador.incrementar();
		System.out.println(contador.getValorActual());
		contador.decrementar();
		System.out.println(contador);
		contador.resetar();
		System.out.println(contador);
		
	}

}
