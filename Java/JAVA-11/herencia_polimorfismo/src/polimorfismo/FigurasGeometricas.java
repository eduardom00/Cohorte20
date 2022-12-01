package polimorfismo;

public abstract class FigurasGeometricas {
//Lo que me permite una clase abstracta es 
	//que no puede tener instancias
	//Tienen métodos abstractos
	//Permiten la sobreescritura a traves de la herencia
	protected double pValor;
	protected double sValor;
	protected double resultado;
	
	public abstract void pedirDatos();
	public abstract void area();
		
	public void visualizar() {
			System.out.println("El valor del área es: " + resultado);
		}
}

		/*s=new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
	pValor=s.nextDouble();
	System.out.println("Introduzca el segundo valor: ");
	sValor=s.nextDouble();
	 */