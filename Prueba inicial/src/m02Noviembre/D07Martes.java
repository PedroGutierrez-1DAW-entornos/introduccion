package m02Noviembre;

public class D07Martes {
	/*
	 * Bucles
	 */
	public static void main(String[] args) {
		//int i=10;
		//while(i>0)
		//	System.out.println(--i);
		for(int i=0; i<20; i++){
			if(i==11) break; // Se carga la ejecuci�n y pasa del for
			if(i%2>0) continue;	// Salta la ejecuci�n de esta repetici�n
			System.out.println(i);
		}		
	}

}
