package constructorconcpt;

public class ModifiersApplicable {
	
	public ModifiersApplicable(){
		System.out.println("public,default,protected,private(singalton classes) access modifiers is allowed");
	}
	

	public static void main(String[] args) {
		ModifiersApplicable p = new ModifiersApplicable();

	}

}
