package colecciones;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//Arrays - Arreglos - Matrices
		//Solo permiten un tipo de dato
		//Debe especificarse su tamaño
		/* String, int, double, long*/
		String [] miArreglo = new String[5];
		
		miArreglo[0] = "Eduardo";
		miArreglo[1] = "Raúl";
		miArreglo[2] = "Felipe";
		miArreglo[3] = "Miguel";
		miArreglo[4] = "Victor";

		System.out.println(miArreglo[0]);
		
		//for
		for(int i=0;i<miArreglo.length;i++) {
			System.out.println("Ciclo For "+miArreglo[i]);
		}
		System.out.println("----------------");
		//forEach
		for(String nombre : miArreglo) {
			System.out.println("For Each: " + nombre);
			
		}
		//Math.pow(2,2);
		//Arrays
		System.out.println(Arrays.toString(miArreglo));
		
		//Tipos de valores
		int numeros [] = new int[5];
		numeros[0] = 3;
		numeros[1] = -56;
		numeros[2] = (int) 3.95; //casteo == cambiar la clase del valor
		numeros[3] = Integer.parseInt("2"); //parseo == cambiar la clase del valor
		
		for(int numero : numeros) {
			System.out.println("Valores del arreglo números: " + numero);
		}
		
		//Arreglos de objetos
		persona persona1 = new persona("Pancho", 5);
		persona persona2 = new persona("Eduardo", 23);

		//
		persona [] arrPersonas = new persona[3];
		arrPersonas [0] = persona1;
		arrPersonas [1] = persona2;
		arrPersonas [2] = new persona("Luis",18);
		System.out.println(arrPersonas[0]);
		System.out.println(arrPersonas[1]);
		System.out.println(arrPersonas[2]);
		
		//Arreglos literales
		String[] arrString = {"Manzana", "Pera","12","Hola"};
		System.out.println(Arrays.toString(arrString));

	}
	
}
