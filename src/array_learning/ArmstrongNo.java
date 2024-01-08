package array_learning;

import java.util.Scanner;

//input no. = 153 -->(1^3+5^3+3^3)or (1*1*1* + 5*5*5 + 3*3*3)==153

public class ArmstrongNo {
	public static void main(String[] args) {
		
		System.out.println("Enter any no.");
		Scanner r = new Scanner(System.in);
		
		int n = r.nextInt();
		int sum = 0;
		int c = n;
		
		while(n>0) {
			int rem = n%10;
			sum = (rem*rem*rem)+sum;
			n = n/10;
		}
		if(c==sum) {
			System.out.println("Armstrong no.");
		}else {
			System.out.println("Not armstrong");
		}
		
	}

}
