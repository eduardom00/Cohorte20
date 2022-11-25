package oop;

public class SubMarino {
	//
	static void submenu () {
		Menu m = new Menu();
		OperacionesAritmeticas oa = new OperacionesAritmeticas();
		do {
		switch(m.subMenuOP()) {
		case 1: {
			System.out.println(oa.add());	
			break;
		}
		case 2:{
			System.out.println(oa.sustrac());
			break;
		}
		case 3:{
			System.out.println(oa.product());
			break;
		}
		case 4: {
			System.out.println(oa.divide());
			break;
		}
		case 5: {
			System.out.println(oa.modulo());
			break;
		}
		case 6: {
			System.out.println("Soy el caso 6 ");
			break;
			}
		default:
			break;
		}
		} while (m.subMenuOP()!=7);
	
	}


}
