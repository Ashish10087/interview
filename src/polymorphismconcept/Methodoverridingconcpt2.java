package polymorphismconcept;

public class Methodoverridingconcpt2 extends Methodoverridingconcpt {
	public void color() {
		System.out.println("tiger color method");
	}
	public void legs() {
		System.out.println("tiger legs method");
	}

	public static void main(String[] args) {
		Methodoverridingconcpt obj = new Methodoverridingconcpt();
		obj.head();
		obj.legs();
		obj.tail();
		Methodoverridingconcpt2 obj1 = new Methodoverridingconcpt2();
		obj1.color();
		obj1.legs();
		Methodoverridingconcpt obj2 = new Methodoverridingconcpt2();
		obj2.legs();
		
		
		
	}

}
