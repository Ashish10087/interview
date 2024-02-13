package constructorconcpt;

public class SuperThis {
	
	SuperThis(){
		super();
		//this();  (we can use either super or this but not both because of following condition)
		System.out.println("call to super or this must be first statement in constructor or we will get compile time error");
	}

	public static void main(String[] args) {
	SuperThis call = new SuperThis();
        // we can use super or this only in constructor but not in method.
	}

}
