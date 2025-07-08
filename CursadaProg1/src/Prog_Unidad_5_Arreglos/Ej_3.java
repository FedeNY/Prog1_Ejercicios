package Prog_Unidad_5_Arreglos;

/*
Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.
*/

public class Ej_3 {
	
	public static final int MAX = 10;
	
	public static void main(String[] args) {
		
		int [] arr = {42, 7, 85, 13, 29, 64, 91, 38, 56, 10};
		
		System.out.println(superiorPromedio(arr,calcularPromedio(arr)) + " Elemento(s) superaron el promedio");
	}
	
	public static double calcularPromedio (int [] arr) {
		
		double total = 0;
		
		for(int num : arr)
			total += num;
		
		return total/MAX;
	}

	
	public static int superiorPromedio(int []arr , double promedio) {
		
		int cant = 0;
		
		for(int num : arr) {
			if(num > promedio)
				cant++;
		}
		
		return cant;
	}
	
}
