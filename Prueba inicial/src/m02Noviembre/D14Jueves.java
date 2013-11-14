package m02Noviembre;

import m01Octubre.D31Jueves;

public class D14Jueves {
	
	/*
	 * Estructura de datos:
	 *   Estáticas: no cambian su tamaño desde su creación hasta su destrucción.
	 *   Dinámicas: pueden variar de tamaño desde su inicio.
	 *   
	 *   Estructura de datos conocida como Array:
	 *     Es necesario conocer su tamaño.
	 *     El tipo de dato que guarda.
	 */

	public static void main(String[] args) {
		//prueba01();
		//prueba02();
		prueba03();
	}
	public static void prueba01(){
		//int numero = 0; // Solo permite almacenar un valor
		//int[] numeros = {0,1,2,3,4,5,6}; 
		int[] numeros = new int[10];
		
		//numeros[0] = D31Jueves.aleatorio(1, 10);

		for(int i=0; i<numeros.length; i++)
			numeros[i] = D31Jueves.aleatorio(1, 10);

		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i]+"\t");
		
		System.out.println();
		
		for(int i=numeros.length-1; i>=0; i--)
			System.out.print(numeros[i]+"\t");
	}
	public static void prueba02(){
		// Array de 10 números, calcular su media y escribir los mayores de la media

		int[] numeros = new int[10];
		double media = 0;

		for(int i=0; i<numeros.length; i++)
			numeros[i] = D31Jueves.aleatorio(1, 10);
		
		for(int i=0; i<numeros.length; i++)
			media += numeros[i];
		
		System.out.println("Media: " + (media /= numeros.length));
		
		for(int i=0; i<numeros.length; i++)
			System.out.println((numeros[i] > media ? "--->\t" : "\t") + numeros[i]);
	}
	public static void prueba03(){
		// Ordenar un array de 10 números

		int[] numeros = new int[16];

		for(int i=0; i<numeros.length; i++)
			numeros[i] = D31Jueves.aleatorio(1, 10);
		
		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i] + "\t");
		
		// Algoritmo de ordenación
		for(int i=0; i<numeros.length; i++)
			for(int j=0; j<numeros.length-1-i; j++)
				if(numeros[j] > numeros[j+1]){
					int temp = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp;
				}

		System.out.println();
		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i] + "\t");
	}

}
