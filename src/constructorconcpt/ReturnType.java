package constructorconcpt;
//Every time you give return type to constructor compiler will treat it as a method
public class ReturnType {
	void ReturnType(){
		System.out.println("Return type concept is not applicable for Constructor");
	}
	public static void main(String[] args) {
		ReturnType rt = new ReturnType();
		ReturnType rt1 = new ReturnType();
		rt.ReturnType() ; // will only execute for this statement as it is a method
		
	}

}
