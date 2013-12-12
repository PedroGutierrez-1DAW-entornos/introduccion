package ex01_2013_12_12;

import java.util.Scanner;

public class Ej01 {

	//Cuenta los numeros positivos, negativos y ceros que hay en una array (lo pedimos al inicio
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dim = 20;
		int[] numeros = new int[dim]; // He quitado el "20" y he se pasa "dim", ya que parece contener la misma historia.
		int pos = 0,
			neg = 0,
			cer = 0; // he dejado el formato de la declaración de las variables un poco más limpio
		
		System.out.println("Leemos los números y los introducimos a un array.");
		
		// Inicialmente la condición era: "i>numeros.length"... y poco iba a funcionar...
		for(int i=0; i<numeros.length; i++){
			System.out.print("numeros[" + i + "]=");
			numeros[i] = sc.nextInt(); // has puesto un do..while sin sentido, sería un bucle infinito
		}
		
		/*
		 * En esta parte del código no se conseguiría evaluar de la forma correcta
		 * el número de positivos, negativos y ceros, ya que el bucle "avanza" en el
		 * caso de que "numeros[0]" sea mayor a 0, menor a 0 o igual a 0, por lo que
		 * solo avanzaría un for.
		 * Si todos fuesen positivos se evaluarían todos los positivos del tirón,
		 * al igual que si fuesen negativos todos o ceros. Pero no se conseguiría
		 * evaluar resultados diferentes.
		 * 
		 * Bueno, yo te lo he contado... tuuuuu... entiende lo que quieras.
		 */
		for(int i=0; i<numeros.length; i++){
			if(numeros[i]>0) // Si es positivo... pos++
				pos++;
			else if(numeros[i]<0) // Si es negativo... neg++
				neg++;
			else // Y si no se cumple no anterior... será que es 0
				cer++;
		}

		System.out.println("Números positivos: " + pos);
		System.out.println("Números negativos: " + neg);
		System.out.println("Número de ceros: " + cer);		
		
		sc.close();
	}

}
