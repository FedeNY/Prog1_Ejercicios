package Prog_Unidad_5_Arreglos;

/*
Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original.
*/
public class Ej_7 {

	public static final int N = 42;
	
	public static final int M = 2;
	
	public static final int MAX = 16;

	public static void main(String[] args) {
		int[] arr = { 17, 42, 23, 42, 64, 42, 28, 56, 39, 51, 46, 31, 11, 42, 13, 34 };
		
		int tamanio = contarArr(arr);
		
		int[] arrPos = cargarArr(arr, tamanio);
		
		multiplicarOcurrencias(arr, arrPos, tamanio);
		
		for( int num : arr) {
			System.out.print(" " + num + " ");
			}
			System.out.println();
		
	
	}	

	public static int contarArr(int[] arr) {
		int cont = 0;
		for (int num : arr) {
			if (num == N)
				cont++;
		}
		return cont;
	}

	public static int[] cargarArr(int[] arr, int tamanio) {

		int[] arrPos = new int[tamanio];

		int j = 0;

		for (int i = 0; i < MAX; i++) {

			if (arr[i] == N) {
				arrPos[j] = i;
				j++;
			}

		}

		return arrPos;

	}

	public static void multiplicarOcurrencias(int[] arr, int[] arrPos, int tamanio) {
	
		for (int i = 0; i < tamanio; i++) 
			arr[arrPos[i]] *= M;
				
	}
}
