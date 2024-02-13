package methodconcept;

public class MethodConcpt3 {
	public void reversestring() {
		String sub = "selenium";
		for(int i=sub.length()-1;i>=0;i--) {
			System.out.println(sub.charAt(i));
		}
	}
	

	public static void main(String[] args) {
                 System.out.println("program for printing string in reverse order using method and loop");	
                 MethodConcpt3 restr=  new MethodConcpt3();
                      restr.reversestring();
	}

}
