package clases;

public class miClase {
	int atributo1;
	String atributo2;
	
	public miClase() {
		
	}
	
	public miClase(int atributo1, String atributo2) {

		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	public void metodo() {
		miClase obj = new miClase();
		int n = obj.atributo1 =2357;
		String s =obj.atributo2="Hola";
		System.out.println("-->" + n);
		System.out.println("-->" + s);

	}
	double metodo1() {
		double a=0.0;
		return a;
	};
}
