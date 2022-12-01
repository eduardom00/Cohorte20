package polimorfismo;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas{
Scanner s= new Scanner(System.in);
	@Override
	public void pedirDatos() {
		System.out.println("\t\t\t Area del Triangulo");
		System.out.println("Introduzca el valor de la base: ");
		pValor = s.nextDouble();
		System.out.println("Introduzca el valor de la altura: ");
		sValor = s.nextDouble();
		

	}
	
		public void area() {
		resultado = (pValor*sValor)/2;
		}
	}
