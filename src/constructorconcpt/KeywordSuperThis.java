package constructorconcpt;
class p {
	String p = "parent";
}

public class KeywordSuperThis  extends p{
	String p = "child";
	
	public void m1() {
		System.out.println(p);
		System.out.println(this.p);//"this" is keyword refers current class instance variable 
		System.out.println(super.p);// "super" is keyword refers super class instance variable
	}
	
	public static void main(String[] args) {
		
		KeywordSuperThis obj = new KeywordSuperThis();
		obj.m1();
		
	}
}


