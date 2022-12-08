package livecode3;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		//pedir los datos y asignarlos a variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();
		
		//pedir los datos y asignarlos a variables
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce e segundo numero");
		int num2 = sc2.nextInt();
		int res = MCD(num1,num2);
		System.out.println("El MCD " + res);
	}
		
		
		//Funcion que nos permita calcular el MCD a partir de los dos datos guardados
		
		public static  int MCD(int num1, int num2) {
			
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		
		int resultado=0;
		do {
		resultado = b; //variable
		b=a%b;
		a=resultado;
	} while (b!=0);
	return resultado;
}	
}