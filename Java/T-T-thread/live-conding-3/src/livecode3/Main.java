package livecode3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int naranjas;
		int	mangos;

		System.out.println("Ingrese el numero de mangos");
		mangos= s.nextInt();
		System.out.println("Ingrese el numero de naranjas");
		naranjas= s.nextInt();
		//Instancia
		MangosNaranjas mangosNaranjas=new MangosNaranjas(mangos,naranjas);
		mangosNaranjas.imprimir();
		/*
		System.out.println("El numero de mangos en cada caja es de: "
		+mangos + "El número de naranjas en cada caja es: " + naranjas);
	*/
	}

}
