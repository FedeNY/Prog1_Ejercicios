package Prog_Unidad_5_Arreglos;
/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
*/

public class Ej_2 {
	
	public static final int MAX = 10;
	
	public static void main(String[] args) {
		
		int [] arr = {42, 7, 85, 13, 29, 64, 91, 38, 56, 10};
		
		System.out.println("El promedio es : " + calcularPromedio(arr));

	}
	
	public static double calcularPromedio (int [] arr) {
		double total = 0;
		
		for(int num : arr)
			total += num;
		
		return total/MAX;
	}

}
