package demy;

import java.util.Scanner;

public class Ejer1 {
	public static void main (String[] args) {
		Scanner consola = new Scanner (System.in);
		System.out.println("Introduce el nombre del libro");
		String titulo = consola.nextLine();
		System.out.println("Introduce el nombre del autor");
		String autor = consola.nextLine();
		
		System.out.println("El titulo es " + titulo + " escrito por: " + autor);
	}
}
