package livecode3;

import java.util.Scanner;

public class MangosNaranjas {
	//Scanner consola = new Scanner (System.in);
	Scanner s = new Scanner (System.in);
		
		int naranjas;
		int	mangos;

	public MangosNaranjas(int mangos, int naranjas) {
		this.naranjas=naranjas;
		this.mangos=mangos;
	}
	public int calculaMCD(int mangos, int naranjas) {
		if (mangos>naranjas) {
			int temporal =	mangos;
			mangos = naranjas%mangos;
		}
		
	}
	public void imprimir() {
		System.out.println("El numero de mangos es:" + mangos+
				"El numero de naranjas es: " + naranjas);
		
	}

	
	}
	