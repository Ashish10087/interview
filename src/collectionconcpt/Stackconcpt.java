package collectionconcpt;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stackconcpt {

	public static void main(String[] args) {
		Stack n = new Stack();
		n.push("100");
		n.push(200);
		n.push(300);
		n.push(400);
		System.out.println(n);
		Enumeration e = n.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		
		}
		System.out.println("*****************");
		Iterator it = n.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****************");
		ListIterator lit = n.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("*****************");
		for(Object o : n) {
			System.out.println(o);
		}

	}

}
