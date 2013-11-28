package m02Noviembre;

public class D28Jueves {
	/*
	 * Vamos a cauclar los grastos de unas personas
	 * 	Luis	Pepe	Maria	Juan
	 * 	10		23		12		48
	 * 	29		38		14		29
	 * 	28		48		23		89
	 * 	29		84		23		12
	 */

	public static void main(String[] args) {
		
		int[][] gastos = {
				{10,23,12,48},
				{29,38,14,29},
				{28,48,23,89},
				{29,84,23,12},
		};
		int total = 0;
		for(int x=0; x<gastos.length; x++)
			for(int y=0; y<gastos[x].length; y++)
				total += gastos[x][y];
		System.out.println(total);

	}

}
