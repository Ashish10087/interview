package encapsulationconcpt;

public class Enclass2 extends Enclass1 {
	
	

	public static void main(String[] args) {
		Enclass2 obj = new Enclass2();
		System.out.println(obj.getName());
		System.out.println(obj.getEmpid());
		obj.setName("ashish");
		obj.setEmpid(200);
		System.out.println(obj.getName());
		System.out.println(obj.getEmpid());
		
		

	}

}
