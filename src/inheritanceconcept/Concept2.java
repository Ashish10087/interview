package inheritanceconcept;

public class Concept2 extends Concept1 {
	
	public void s1() {
		System.out.println("s1 method in concept2 class");
	}
	public void s2() {
		System.out.println("s2 method in concept2 classs");
	}

	public static void main(String[] args) {
		Concept2 obj = new Concept2();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.s1();
		obj.s2();
		

	}

}
