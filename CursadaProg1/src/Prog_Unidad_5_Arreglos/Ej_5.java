package Prog_Unidad_5_Arreglos;

/*Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido.*/

public class Ej_5 {

	public static final int MAX = 10;

	public static void main(String[] args) {

		char[] letras = { 'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h', 'I', 'j' };

		invertirArr(letras);

		imprimirArray(letras);

	}

	public static void invertirArr(char[] letra) {

		int j = MAX - 1;

		for (int i = 0; i < MAX / 2; i++, j--) {
			char aux = letra[i];
			letra[i] = letra[j];
			letra[j] = aux;
		}
	}

	public static void imprimirArray(char[] arr) {
		for (char letra : arr) {
			System.out.print(letra + "\t");
		}
		System.out.println();
	}

}
