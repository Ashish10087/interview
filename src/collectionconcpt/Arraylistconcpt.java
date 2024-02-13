package collectionconcpt;

import java.util.ArrayList;

public class Arraylistconcpt {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("jay");
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		ar.add("abz");
		ar.add("x");
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.contains("x"));
		int a = ar.indexOf("x");
		System.out.println(a);
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar.get(1));
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		
		}
		ArrayList ar2 = new ArrayList();
		ar2.add(60);
		ar2.add(70);
		ar2.add(80);
		ar2.add(50);
		ar.retainAll(ar2);
		//System.out.println(ar.get(5));
		//System.out.println(ar2.add(2));
		System.out.println(ar2.size());
		for(int i = 0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}
	System.out.println(ar2.isEmpty());
		ar.removeAll(ar2);
		for(int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
       ar2.clear();
       for(int i = 0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}
	}

}
