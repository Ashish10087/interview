package superandthisConcept;

public class Sample1 extends Demo1 {
	int a =777;
	public void xyz() {
		int a = 555;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
 
		Sample1 obj = new Sample1();
		obj.xyz();
		

	}

}
