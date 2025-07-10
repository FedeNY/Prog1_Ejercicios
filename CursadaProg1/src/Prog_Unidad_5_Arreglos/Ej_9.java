package Prog_Unidad_5_Arreglos;

/*Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida.
*/

public class Ej_9 {
	
	public static final int MAX = 10;

	public static void main(String[] args) {
		char[] letras = { 'a', 'e', 'r', 't', 'b', 'o', 'm', 'l', 'l', 'u' };

		System.out.println((buscarRepetida(letras)? "Hay al menos una" : "No hay") + " repetida");
		
	}
	
	public static boolean buscarRepetida(char [] arr) {
		
		int i = 0;
		int j = MAX;
		
		while(i < MAX && j == MAX) {
			
			j = 0;
			
			while(j < MAX && (arr[i] != arr[j] || j == i))
					j++;
			
			i++;
		}
		
		return i < MAX;
	}

}
