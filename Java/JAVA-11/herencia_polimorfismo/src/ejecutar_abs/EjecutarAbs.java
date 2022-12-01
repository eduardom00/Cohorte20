package ejecutar_abs;

import polimorfismo.*;

public class EjecutarAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigurasGeometricas t = new Triangulo();
		FigurasGeometricas c = new Cuadrado();
		FigurasGeometricas ci = new Circulo();
		FigurasGeometricas r = new Rectangulo();

	t.pedirDatos();
	t.area();
	t.visualizar();
	
	c.pedirDatos();
	c.area();
	c.visualizar();
	
	ci.pedirDatos();
	ci.area();
	ci.visualizar();
	
	r.pedirDatos();
	r.area();
	r.visualizar();
	
	}
}
