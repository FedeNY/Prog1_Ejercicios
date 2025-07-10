package Prog_Unidad_5_Arreglos;

/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.
*/

public class Ej_6 {

	public static void main(String[] args) {
		int [] arr = {17,23,42,64,28,56,39,51,46,31,11};
		
		System.out.println("Cantidad de numeros pares : " + contarPares(arr));

	}
	
	public static int contarPares(int [] arr) {
		int cont = 0;
		for(int num : arr){
			if(num % 2== 0)
				cont++;
		}
			
		return cont; 
	}

}
