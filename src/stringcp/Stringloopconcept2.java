package stringcp;

public class Stringloopconcept2 {

	public static void main(String[] args) {
		String p ="Pritika";
		int x = p.length();
		System.out.println(x);
		for(int i =0;i<=x-1;i++) {
			System.out.println(p.charAt(i));
		}
		String a ="Ashish";
		String k =p.concat(a);
		System.out.println(k);
	
	}

}
