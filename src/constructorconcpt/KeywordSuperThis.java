package constructorconcpt;
class p {
	String p = "parent";
}

public class KeywordSuperThis  extends p{
	String p = "child";
	
	public void m1() {
		System.out.println(p);
		System.out.println(this.p);
		System.out.println(super.p);
	}
	
	public static void main(String[] args) {
		
		KeywordSuperThis obj = new KeywordSuperThis();
		obj.m1();
		
	}
}


