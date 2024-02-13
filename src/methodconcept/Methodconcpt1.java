package methodconcept;

public class Methodconcpt1 {
//Non static method
	public static void main(String[] args) {
		Methodconcpt1 obj = new Methodconcpt1();
		obj.Test();
		int t = obj.exp();
		int p = obj.addition(20, 30);
		System.out.println(t);
		System.out.println(p);

	}


public void Test(){
	System.out.println("test no input no output"); 
	
}
public int exp(){
	System.out.println("no input some output");    
	int a=10;
	int b =20;
	int c=a+b;
	return c;
	
}
public int addition(int x, int y) {
	System.out.println("some input some output");
	int z=x+y;
	return z;
	
}
}