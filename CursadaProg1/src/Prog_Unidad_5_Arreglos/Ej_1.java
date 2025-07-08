package Prog_Unidad_5_Arreglos;

/*1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado*/

public class Ej_1 {

	public static final int MAX = 15;
	public static final int numMAX = 12;
	public static final int numMIN = 1;
	
	public static void main(String[] args) {

		int[] arr = new int[MAX];

		cargarArray(arr);

		imprimirArray(arr);

	}

	public static void cargarArray(int[] arr) {
			
		for(int i = 0; i < MAX; i++)
			arr[i] = pedirNumero(i+1);
		
	}

	public static int pedirNumero(int cant) {

		int num = 0;
		
		while (num > numMAX || num < numMIN) {
			System.out.println("Ingrese un número entre " + numMIN + " y " + numMAX + " (" + cant + "/" + MAX + "):");
			num = Utils.leerInt();
			if(num > numMAX  || num < numMIN )
			 System.out.println("Numero invalido");
	}
		return num;
	}

	public static void imprimirArray(int[] arr) {
		for (int num : arr)
			System.out.println(num);
	}

}
