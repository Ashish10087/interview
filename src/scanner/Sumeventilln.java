package scanner;

import java.util.Scanner;

public class Sumeventilln {
	
	static int sumevenn(int n) {
		int i;
		int sum =0;
		for (i=2;i<=n;i+=2) {
			sum +=i;
		}
		return sum;
	}

	public static void main(String[] args) {
	
		System.out.println("Enter any no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("sum of all even no from 1 "+n+" is "+sumevenn(n));
		sc.close();

	}

}
