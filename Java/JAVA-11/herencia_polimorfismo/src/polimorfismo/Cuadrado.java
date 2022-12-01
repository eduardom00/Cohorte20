package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas{
Scanner s = new Scanner(System.in);
	@Override
	
	public void pedirDatos() {
		System.out.println("\t\t\t Area del Cuadrado");
		System.out.println("Introduzca el valor del lado : ");
		pValor = s.nextDouble();
	}

	public void area() {
		// TODO Auto-generated method stub
		resultado = pValor*pValor;
	}

}
