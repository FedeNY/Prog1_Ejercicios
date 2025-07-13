package Prog_Unidad_5_Arreglos;
/*
Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main: un
arreglo con las posiciones de los caracteres que son letras
vocales y otro con las posiciones que son consonantes 
*/

public class Eje_14 {

	public static final int MAX = 20;

	public static void main(String[] args) {

		char[] letras = { 'a', 'r', 'e', 'k', 'u', 'm', 'i', 'z', 'o', 'b', 't', 'a', 'n', 'e', 's', 'u', 'j', 'o', 'p',
				'i' };
		int cantidadVoc = calcularVocales(letras);
		int[] vocal = new int[cantidadVoc];
		int[] consonante = new int[MAX - cantidadVoc];
		cargarArr(letras, vocal, consonante);
	}

	public static int calcularVocales(char[] arrLetras) {
		int cant = 0;
		for (int i = 0; i < MAX; i++)
			if (esVocal(arrLetras[i]))
				cant++;
		return cant;
	}

	public static boolean esVocal(char letra) {
		boolean estado = false;
		switch (letra) {
		case 'a', 'e', 'i', 'o', 'u': estado = true ; break ;
		}
		return estado;
	}

	public static void cargarArr(char[] arrLetras, int[] arrVocal, int[] arrCons) {
		int contVocal = 0, contCons = 0;

		for (int i = 0; i < MAX; i++) {
			if (esVocal(arrLetras[i]))
				arrVocal[contVocal++] = i;
			else
				arrCons[contCons++] = i;
		}
	}
}
