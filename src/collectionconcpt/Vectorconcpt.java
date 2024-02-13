package collectionconcpt;

import java.util.Iterator;
import java.util.Vector;

public class Vectorconcpt {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(200);
		v.add(300);
		v.add(400);
		v.add(500);
		System.out.println(v);
		v.addElement(600);
		System.out.println(v);
		System.out.println(v.firstElement());
		for(int i = 0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		for(Object c :v) {
			System.out.println(c);
		}
		Vector v1 = new Vector();
		v1.addElement(700);
		v1.add(800);
		v1.add(900);
		v1.add(500);
		System.out.println(v1);
		System.out.println(v);
		v.retainAll(v1);
		System.out.println(v);
		System.out.println(v1);
		Iterator<Integer> j =  v1.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}

	}

}
