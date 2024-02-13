package methodconcept;

public class MethodConcpt2 {
	public void LoopMethod() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method starts here");
		MethodConcpt2 num = new MethodConcpt2();
		num.LoopMethod();
		System.out.println("loop with method executed successfully");
		System.out.println("");
		System.out.println("Main method ends here");
		
	}

}
