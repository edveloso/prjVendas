package modelo;



interface B{
	void getL();
	void getW();
}

class A implements B{
	public void getL() {System.out.println("hello");}
	public void getW() {System.out.println("wold");}
}

public class Programa {

	
	public static void main(String[] args) {
		
		
		A a = new A();
		B b = (B)a;
		a.getW();
		b.getL();
		
		
	}
	
}
