package Prog_Unidad_5_Arreglos;

/*Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B.
*/

public class Eje_11 {
	public static final int MAXA = 20;
	public static final int MAXB = 6;

	public static void main(String[] args) {
		int[] A = { 13, 1, 7, 3, 10, 3, 17, 2, 12, 4, 15, 5, 19, 8, 9, 18, 14, 16, 20, 11 };
		int[] B = { 1, 6, 5, 3, 2, 4 };

		ordenar(A, MAXA);
		ordenar(B, MAXB);

		System.out.println(((buscar(A, B))? "Estan" : "No estan" ) + "todos los elementos");
	
	}
	

	public static void ordenar(int[] arr, int maxArr) {
		for (int i = 0; i < maxArr; i++) {
			for (int j = 0; j < maxArr; j++) {
				if (arr[i] < arr[j]) {
					int aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}
			}
		}
	}
 
	public static boolean buscar(int[] arrA, int[] arrB) {
	    int i = 0, j = 0,cont = 0; 
	    boolean seguir = true;

	    while (i < MAXB && j < MAXA && seguir) {
	        if (arrB[i] == arrA[j]) {
	        	cont++;
	            i++;
	        } else if (arrB[i] > arrA[j]) {
	            j++;
	        } else {
	        	seguir= false;}
	    }

	    return cont == MAXB;
	}
}
