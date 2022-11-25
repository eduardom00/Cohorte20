package operadores;

import java.util.Scanner;

public class operadores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
/*
		//Esto nos sirve para pedir el STRING
		//System.out.println("---- Da un dato: ----");
	//Esto nos sirve para guardar el STRING
		//String dato = scanner.nextLine();
		//System.out.println("El dato es: "+ dato);
		
		
	//next.INT nos permite guardar un INT
		System.out.println("Introduce el valor1" );
		int valor1 = scanner.nextInt();
		
		System.out.println("Introduce el valor0" );
		int valor0 = scanner.nextInt();
	
		int suma = valor1+valor0;
		System.out.println("Suma " + suma);
		
		int resta = valor1-valor0;
		System.out.println("Resta " + resta);
		
		int multi= valor1*valor0;
		System.out.println("Multiplicacion " + multi);
		
		int div = valor1/valor0;
		System.out.println("Division " + div);
		
		int residuo = valor1%valor0;
		System.out.println("Residuo de la division " + residuo);
		
		System.out.println("\t ---Modulo--");
		System.out.print("Introduzca un numero");
		int datosMo = scanner.nextInt();
		System.out.print("Introduzca un numero");
		int datosMo1 = scanner.nextInt();
		int modulo = datosMo % datosMo1;
		System.out.println("Modulo: " + modulo);
		if (modulo == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero no es par ");
		}
		*/
		/*int a = 3;
		int b = 5;
		boolean comparar = a>=b;
		boolean logica = true;
			
		if (comparar && logica) {
			System.out.println("Ambos son verdaderos");
			System.out.println("comparar: " + comparar);
		} else {
			System.out.println(comparar);
			System.out.println(logica);
		}*/
		int numero = 0;
		do {
		System.out.println("1 = Suma: ");
		System.out.println("2 = Resta: ");
		System.out.println("3 = Multiplicacion: ");
		System.out.println("4 = División: ");
		System.out.println("5 = Residuo: ");
		System.out.println("6 = Salir: ");
		
		System.out.print("Introduzca la opción: ");
		numero = scanner.nextInt();
		String msj = "";
		switch (numero) {
		case 1:
			System.out.println("Introduce el valor1" );
			int valor1 = scanner.nextInt();
			
			System.out.println("Introduce el valor2" );
			int valor0 = scanner.nextInt();
		
			int suma = valor1+valor0;
			System.out.println("Suma " + suma);
			break;
		case 2: 
			System.out.println("Introduce el valor1" );
			int res1 = scanner.nextInt();
			
			System.out.println("Introduce el valor2" );
			int res2 = scanner.nextInt();
		
			int resta = res1-res2;
			System.out.println("Resta " + resta);			
			break;
		case 3: 
			System.out.println("Introduce el valor1" );
			int mul1= scanner.nextInt();
			
			System.out.println("Introduce el valor2" );
			int mul2 = scanner.nextInt();
		
			int multiplicación = mul1*mul2;
			System.out.println("Multiplicacion " + multiplicación);	
			break;	
		case 4:
			System.out.println("Introduce el valor1" );
			int div1 = scanner.nextInt();
			
			System.out.println("Introduce el valor2" );
			int div2 = scanner.nextInt();
		
			int div = div1/div2;
			System.out.println("Division " + div);
			break;
		case 5:
			System.out.println("Introduce el valor1" );
			int rsd1 = scanner.nextInt();
			
			System.out.println("Introduce el valor2" );
			int rsd2 = scanner.nextInt();
		
			int Res = rsd1%rsd2;
			System.out.println("Residuo " + Res);
		case 6:
			System.out.print("Byee");
		break;
			default:
				break;
		}
		}
		while (numero != 6);

	}

}
