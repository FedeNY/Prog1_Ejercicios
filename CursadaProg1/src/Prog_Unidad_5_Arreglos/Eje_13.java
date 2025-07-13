package Prog_Unidad_5_Arreglos;

/*
Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main dos
arreglos: un arreglo con los caracteres que son letras vocales y
otro con los que son consonantes.
 */

public class Eje_13 {

	public static final int MAX = 20;

	public static void main(String[] args) {

		char[] letras = { 'a', 'r', 'e', 'k', 'u', 'm', 'i', 'z', 'o', 'b', 't', 'a', 'n', 'e', 's', 'u', 'j', 'o', 'p',
				'i' };
		int cantidadVoc = calcularVocales(letras);
		char[] vocal = new char[cantidadVoc];
		char[] consonante = new char[MAX - cantidadVoc];
		cargarArr(letras, vocal, consonante);
		
		for( char numC : consonante) {
			System.out.print(" " + numC + " ");
			}
			System.out.println();
		
			for( char numV : vocal) {
				System.out.print(" " + numV + " ");
				}
				System.out.println();

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

	public static void cargarArr(char[] arrLetras, char[] arrVocal, char[] arrCons) {
		int contVocal = 0, contCons = 0;

		for (int i = 0; i < MAX; i++) {
			if (esVocal(arrLetras[i]))
				arrVocal[contVocal++] = arrLetras[i];
			else
				arrCons[contCons++] = arrLetras[i];
		}
	}
}
