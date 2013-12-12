package ex01_2013_12_05;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numAlum=teclado.nextInt(),
				i=0, j=0;
		double suma = 0, media=0,Suma=0;
		
		//
		System.out.println("numero de alumnos de la clase: "+numAlum);
			
		int[]notas = new int[numAlum];
		//
		for(i = 0; i<notas.length;++i){
			System.out.println("Alumno " + (i+1) + " nota final:");
			notas[i]=teclado.nextInt();
		}
		//
		for(i=0;i<notas.length;++i){
			Suma = Suma + notas[i];
		}
		media=Suma/notas.length;
		System.out.println("Nota media del curso: " +media);
		
		//
		System.out.println("Listado de las notas superiores a la media");
		for(i=0; i<notas.length; i++)
			if(notas[i]>media){
				System.out.println("Alumno numero "+(i+1)+" - Nota final: " + notas[i]);		
			}
		//
		System.out.println("Nota maxima de los alumnos");
		int maxima=0;
		for(i=0;i<notas.length;++i){
			if(maxima<notas[i]) maxima = notas[i];
			
		}
		System.out.println(maxima);
	}

}