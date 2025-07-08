package Prog_Unidad_5_Arreglos;

/*
Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.

 */

public class Ej_4 {

	public static final int MAX = 10;

	public static void main(String[] args) {

		char[] letras = { 'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h', 'I', 'j' };

		char buscar = 'b';

		int result = buscarChar(letras, buscar);

		System.out.println((result == MAX) ? "No se han encontrado coincidencias"
				: "La letra " + buscar + " se encontro en la posicion " + result);

	}

	public static int buscarChar(char[] arr, char buscada) {

		int ini = 0;

		while (ini < MAX && arr[ini] != buscada)
			ini++;

		return ini;
	}

}
