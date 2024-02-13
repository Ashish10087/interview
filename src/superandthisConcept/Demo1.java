package superandthisConcept;

public class Demo1 {
	int a = 100;
	public void abc() {
		int a = 900;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.abc();
		

	}

}
