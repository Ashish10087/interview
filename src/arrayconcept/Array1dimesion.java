package arrayconcept;

public class Array1dimesion {

	public static void main(String[] args) {
		int abc[]=new int[5];
		abc[0]=10;
		abc[1]=20;
		abc[2]=30;
		abc[3]=40;
		abc[4]=50;
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println(abc[2]);
		System.out.println(abc[3]);
		System.out.println(abc[4]);
		System.out.println("");
		System.out.println(abc[0]+abc[1]);
		System.out.println(abc[2]+abc[3]);
		System.out.println("");
		System.out.println(abc.length);
		for(int i=0;i<abc.length;i++) {
			System.out.println(abc[i]);
		}
	}

}
