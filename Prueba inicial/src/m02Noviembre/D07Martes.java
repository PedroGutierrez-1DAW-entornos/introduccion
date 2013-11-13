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
			if(i==11) break; // Se carga la ejecución y pasa del for
			if(i%2>0) continue;	// Salta la ejecución de esta repetición
			System.out.println(i);
		}		
	}

}
