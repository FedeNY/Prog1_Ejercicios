package Prog_Unidad_5_Arreglos;

/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados.*/

public class Eje_10 {

	public static final int N = 2;

	public static final int MAX = 10;

	public static void main(String[] args) {

		int[] arr = { 12, 7, 18, 5, 24, 33, 2, 19, 40, 8 };

		int cant = comprobarCantPrimos(arr);

		System.out.println((((cant >= N) ? "El arreglo tiene al menos " + N + " numeros primos"
				: "no cumple con la cantidad minima de numeros primos") + " (" + cant + ")"));

	}

	public static int comprobarCantPrimos(int[] arr) {

		int cant = 0;

		for (int i = 0; i < MAX; i++) {

			int j = 2;

			while (j < arr[i] && arr[i] % j != 0)
				j++;

			if (j == arr[i])
				cant++;

		}
		return cant;
	}

}
