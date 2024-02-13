package methodconcept;

public class LocalvsGlobalVar {
	int age =28;
	String st="java";

	public static void main(String[] args) {
		int a =20; //local variable
		System.out.println(a);
		LocalvsGlobalVar obj = new LocalvsGlobalVar();
		System.out.println(obj.age);
		int age =obj.addition();
		System.out.println(age);
		System.out.println(obj.st);
				
		
	}
	public int addition() {
		//local variable for only addition method
		int a =20;
		int b=30;
		int age =a+b;
		System.out.println(age);
		return age;
	}
	

}
