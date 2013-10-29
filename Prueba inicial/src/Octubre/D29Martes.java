package Octubre;

public class D29Martes {

	public static void main(String[] args) {
		// Operadores booleanos. Operan expresiones lógicas.
		boolean resultado = 2 * 3 == 5;
		System.out.println( resultado );
		
		if(resultado == true){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		// Operadores específicos de valores lógicos
		//   No (!) es un operador monario. Cambia el valor lógico de true a false y al contrario.
		//   Y (&&) es un operador binario. Cuando las dos son verdades el resultado es true (sino false)
		//   O (||) es un operador binario. Cuando uno de los dos es verdadero el resultado es true.
		if( 3 < 2 || 2 < 4){
			System.out.println("Cierto");
		}else{
			System.out.println("False");
		}
		
		// Dado dos números enteros escribir el mayor
		int a, b;
		a = (int) (Math.random() * 100 + 1);
		b = (int) (Math.random() * 100 + 1);
		
		if(a > b){
			System.out.println("Es mayor: " + a);
		}else if(a < b){
			System.out.println("Es mayor: " + b);
		}else{
			System.out.println("Son iguales: " + b);
		}

		System.out.println(a + " - " + b);
		
	}

}
