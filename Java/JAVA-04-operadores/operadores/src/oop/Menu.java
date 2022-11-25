package oop;

import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	int MenuOP() {
	int numero=0;
	System.out.println("\t\t ----Menu Principal---- ");	
	System.out.println("1 = Suma: ");
	System.out.println("2 = Resta: ");
	System.out.println("3 = Multiplicacion: ");
	System.out.println("4 = División: ");
	System.out.println("5 = Residuo: ");
	System.out.println("6 = Salir: ");
	
	System.out.print("Introduzca la opción: ");
	return numero = scanner.nextInt();

	}
	int subMenuOP(){
		int numero=0;
	System.out.println("\t\t ----Menu Operaciones Aritmeticas---- ");	
	System.out.println("\t\t 1 = Suma: ");
	System.out.println("\t\t 2 = Resta: ");
	System.out.println("\t\t 3 = Multiplicacion: ");
	System.out.println("\t\t 4 = División: ");
	System.out.println("\t\t 5 = Residuo: ");
	System.out.println("\t\t 6 = Salir: ");
	
	System.out.print("Introduzca la opción: ");
	return numero = scanner.nextInt();

	}
	
}
