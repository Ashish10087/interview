package collectionconcpt;

import java.util.ArrayList;

public class Arraylistconcpt2 {

	public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("java");
	arr.add("selenium");
	arr.add("sql");
	System.out.println(arr);
	System.out.println(arr.isEmpty());
	for(String x: arr) {
		System.out.println(x);
	}

	}

}
