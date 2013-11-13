package m02Noviembre;

import m01Octubre.D31Jueves;

public class D12Martes {
	public static void main(String[] args) {
		
		int n = D31Jueves.aleatorio(0, 10), suma = 0;
		while(n != 0){
			System.out.print(n + " + ");
			suma += n;
			n = D31Jueves.aleatorio(0, 10);
		}
		System.out.print(n + " = " + suma);
		
	}
}
