package encapsulationconcpt;

public class Enclass1 {
  
	private String name = "selenium";
	private int empid = 100;
	public static void main(String[] args) {
		Enclass1 obj = new Enclass1();
		System.out.println(obj.name);
		System.out.println(obj.empid);
		

	}
	public String getName() {
		return name ; 
		
	}
	public void setName (String name) {
		this.name = name;
		
	}
	public int getEmpid() {
		return empid;
	}
     public void setEmpid(int empid) {
    	 this.empid = empid;
     }
}
