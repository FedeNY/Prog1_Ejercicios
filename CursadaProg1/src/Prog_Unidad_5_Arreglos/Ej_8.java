package Prog_Unidad_5_Arreglos;

/*
 * Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente
 */

public class Ej_8 {

	public static final int MAX = 6;

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5 };

		System.out.println("El array " + ((verificarAscendencia(arr)) ? "es" : "no es") + " ascendente");

	}

	public static boolean verificarAscendencia(int[] arr) {
		
		int ini = 0;
		
		while (ini < MAX - 1 && arr[ini] < arr[ini + 1])
			ini++;
		
		return ini == MAX - 1;
	}

}
