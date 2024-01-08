package array_learning;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args) {
		
		System.out.println("Enter any number to calculate factorial:");
		Scanner r = new Scanner(System.in);
		int n = r.nextInt();
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is : "+fact);
		
		
	}

}
