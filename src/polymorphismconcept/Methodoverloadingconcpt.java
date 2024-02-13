package polymorphismconcept;

public class Methodoverloadingconcpt {
	public void abc() {
		System.out.println("abc method with zero arguments");
	}
	public void abc(int a) {
		System.out.println("abc method with 1 int arguments");
		
	}
	public void abc(int a ,int b) {
		System.out.println("abc method with 2 int arguments");
	}
	public void abc(String a) {
		System.out.println("abc method with 1 string arguments");
	}
	public void abc(String a,String b){
		System.out.println("abc method with 2 string arguments");
	}
	

	public static void main(String[] args) {
		Methodoverloadingconcpt obj = new Methodoverloadingconcpt();
		obj.abc();
		obj.abc(10);
		obj.abc(10, 20);
		obj.abc("methodoverloading");
	    obj.abc("methodoverloading", "polymorphism");

	}

}
