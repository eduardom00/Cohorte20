package mis_clases;

import mis_clases.clase_2.ClasePadre;
import mis_clases.clase_2.Clase_2;
import mis_clases.clases_publicas.Clase3;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase3 nc3 = new Clase3();
		nc3.setValor(0156);
	//ClasePadre cp = new ClasePadre(156,"Hola");
		Clase_2 c2 = new Clase_2(156,"Hola","Miguel");
		c2.visualizar();
		c2.visualizar2();
	}
	
}
