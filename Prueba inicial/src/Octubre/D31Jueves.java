package Octubre;

public class D31Jueves {
	/*
	 * Algoritmo
	 *   Optener los tres números: a, b, c (Diferentes)
	 *   Optener el mayor
	 *     Si a es mayor que b y c
	 *       Escribir: mayor es a
	 *     Sino, si b es mayor que a y c
	 *       Escribir: mayor es b
	 *     Sino
	 *       Escribir: mayor es c
	 */
	public static void main(String[] args) {
		// Dado tres números escribir el mayor y menor de ellos
		int a, b, c;
		final int BASE, RANGO;
		
		BASE = 1;
		RANGO = 20;

		a = aleatorio(BASE, RANGO);
		b = aleatorio(BASE, RANGO);
		c = aleatorio(BASE, RANGO);

		if(a >= b && a >= c)
			System.out.println("Mayor: a");
		else if(b >= a && b >= c)
			System.out.println("Mayor: b");
		else
			System.out.println("Mayor: c");
		System.out.println("a: " + a + "\tb: " + b + "\tc: " + c);
	}

	public static int aleatorio(int base, int rango) {
		return (int)(Math.random() * rango + base);
	}

}
