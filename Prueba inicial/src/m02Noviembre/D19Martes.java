package m02Noviembre;

public class D19Martes {

	public static void main(String[] args) {
		
		prueba01();

	}

	private static void prueba01() {
		String[] meses = {"nul", "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"};
		int[] dias = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//int mes = 0;
		// Generamos un mes del 1 al 12
		//mes = m01Octubre.D31Jueves.aleatorio(1, 12);
		
		String nombre = "abr";
		
		for(int i=1; i<meses.length; i++){
			if(nombre.equalsIgnoreCase(meses[i])){
				System.out.println("Mes: " + i);
				System.out.println("Nombre: " + meses[i]);
				System.out.println("Días: " + dias[i]);
			}
		}
		
	}

}
