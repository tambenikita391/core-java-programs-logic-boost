package array_learning;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner r = new Scanner(System.in);
		
		int n = r.nextInt();
		int sum=0;
		int c = n;
		
		while(n>0) {
			int rem = n%10;
			sum = (sum*10)+rem;
			n = n/10;
			
		}
		if(sum==c) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}

}
