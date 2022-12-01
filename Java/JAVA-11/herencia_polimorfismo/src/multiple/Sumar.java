package multiple;

public class Sumar implements OperacionesAritmeticas, Operaciones{
	private double a;
	private double b;
	
	public Sumar(double a, double b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void mensajes() {
		// TODO Auto-generated method stub
		System.out.println("Yo soy la Suma" );
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
