package t01_Monedero;

public class Maquina {

	public static void main(String[] args) {
		Monedero dinero;
		
		/*
		dinero = new Monedero(new int[]{140, 44, 56, 60, 49, 20, 12, 0}); // Si no tiene monedas grandes las devuelve pequeñas
		
		System.out.println(dinero);

		dinero.aniadirMoneda(20, 13);
		dinero.aniadirMoneda(24, 13);

		dinero.pagar(31, new int[]{0, 0, 0, 2, 0, 1, 3});
		*/

		dinero = new Monedero(new int[]{0, 3, 0, 2, 5, 4, 7, 0}); // Sin cambio impar (es fácil que no tenga cambio)
		System.out.println(dinero);

		dinero.pagar(31, new int[]{0, 0, 0, 2, 0, 1, 3});
		dinero.pagar(126, new int[]{0, 0, 0, 2, 0, 1, 3});
	}

}
