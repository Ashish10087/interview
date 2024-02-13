package collectionconcpt;

import java.util.ArrayList;

public class ArrayListconcpt3 {

	public static void main(String[] args) {
		ArrayList ar1 = new ArrayList();
		ar1.add("java");
		ar1.add("sql");
		ar1.add("bdd");
		
		ArrayList ar2 = new ArrayList();
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);
		System.out.println(ar1);
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		ArrayList ar3 = new ArrayList();
		ar3.add(1);
		ar3.add(2);
		ar3.add(3);
		
		ar1.addAll(ar3);
		System.out.println(ar1);
		
		Object [] a = ar1.toArray();
		
		for(Object o: a) {
			System.out.println(o);
			
		}

	}

}
