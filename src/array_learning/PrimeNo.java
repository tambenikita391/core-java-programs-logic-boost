package array_learning;

import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String [] args) {
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		int n = r.nextInt();
		
		int count=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("No. is prime");
		}else {
			System.out.println("no. is not prime");
		}
		
		
		
	}

}
