package stringcp;

public class Stringcomaprision1 {

	public static void main(String[] args) {
		String a= "ashish";
		String p="pritika";
		String c="Ashish";
		String d="Pritika";
		System.out.println(a.equals(p));
        System.out.println(a.equals(c));
        System.out.println(p.equals(d));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(p.equalsIgnoreCase(d));

	}

}
