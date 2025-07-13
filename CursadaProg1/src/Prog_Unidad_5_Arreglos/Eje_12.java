package Prog_Unidad_5_Arreglos;

/*
Dado dos arreglos de números enteros: un arreglo A de tamaño
MAXA y un arreglo B de tamaño MAXB con números entre 0 y
MAXA-1, determinar la suma de los elementos del arreglo A cuyas
posiciones son indicadas por el arreglo B. Por ejemplo, dado
A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
y el 31 de la posición 2 del arreglo A).
 */

public class Eje_12 {

	public static final int MAXA = 3;
	public static final int MAXB = 2;

	public static void main(String[] args) {

		int[] A = { 3, 6, 31, 9 };
		int[] B = { 0, 2 };

		System.out.println(sumarPos(A, B));
	}

	public static int sumarPos(int[] A, int[] B) {
		int result = 0;
		for (int i = 0; i < MAXB; i++)
			result += A[B[i]];
		return result;
	}
}
