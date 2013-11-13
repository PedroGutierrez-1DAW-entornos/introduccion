package m01Octubre;

public class D24Jueves {
	
	public static void main(String[] args) {
		// Operadores
		//   Operadores aritméticos: realizan operaciones con variables o valores de tipo numérico (con resultado numérico)
		//     Los tipos son: int, long, double
		//     Operadores:
		//       Binarios: +, -, *, /, %
		//       Monarios: -, ++, --, +=, -=, *=, /=, %=
		//       Métodos: potencia, raíz... son métodos de Math
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		a = 3;
		b = (2 * 5) + (3 / 2);
		c = (int) Math.sqrt(a); // Forzamos a que sea un número entero
		d = a % b;
		
		System.out.println("a: " + a + "\nb: " + b + "\nc: " + c + "\nd: " + d);

		
		//   Operadores lógicos: prodducen un resultado booleano (true o false).
		//     Operadores:
		//       >   Mayor que
		//       >=  Mayor o igual que
		//       <   Menor que
		//       <=  Menor o igual que
		//       ==  Igual a
		//       !=  Distinto a
		//     No debe de ser usado en comparaciones de cadenas.

		boolean b1, b2, b3, b4;
		
		b1 = c == a;
		b2 = c != a;
		b3 = b >= c;
		b4 = b <= d;		
		
		System.out.println("\n1: " + b1 + "\n2: " + b2 + "\n3: " + b3 + "\n4: " + b4);
		
		// Comparando cadenas con commpareTo()
		String mensaje1 = "H";
		int n = mensaje1.compareTo("A"); // devuelve 7
		
		// Comparando cadenas con equals()
		String mensaje2 = "H";
		boolean bs1 = mensaje2.equals("A"); // false
		boolean bs2 = mensaje2.equals("H"); // true
		
		
		
		
	}
}
