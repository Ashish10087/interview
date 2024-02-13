package conditionalconcept;

import java.util.Scanner;

public class Nestedifconcept {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age");
			int age = sc.nextInt();
			if(age<=18) {
				System.out.println("Your are not eligibale for work");
				
			}
			else {
			    if(age>=18 && age<=60) {
			    	System.out.println("you are eligible to work");
			    }
			    else {
			    	System.out.println("Happy retirement");
			    }
}
		}
	}
}


