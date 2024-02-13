package collectionconcpt;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconcpt {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("test");
		ls.add("api");
		ls.add("selenium");
		ls.add("java");
		System.out.println("content of linkedlist"+ls);
		ls.addFirst("testng");
		ls.addLast("jse");
		System.out.println("updated content of linkedlist"+ls);
		System.out.println(ls.get(1));
		System.out.println(ls.getLast());
		System.out.println(ls.getFirst());
		System.out.println(ls);
		ls.set(1, "constructor");
		System.out.println(ls);
		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
		//print all values from linkedlist using itrator
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		LinkedList ls1 = new LinkedList();
		ls1.add(50);
		ls1.add("jre");
		ls1.add("testng");
		ls1.add("java");
		ls1.add("api");
		System.out.println(ls1);
		System.out.println(ls1.get(3));
		ls.addAll(ls1);
		System.out.println(ls);
		System.out.println(ls1);
		ls.retainAll(ls1);
		System.out.println(ls);
		System.out.println(ls1);
		for(Object o:ls) {
			System.out.println(o);
		}
		Object [] n = ls.toArray();
		for(Object o: n) {
			System.out.println(o);
		}
	}

}
