package array_learning;

import java.util.Scanner;

public class SumOfElt {
	public static void main(String [] args) {
		int sum = 0;
		System.out.println("Enter the range of no.");
		Scanner r =new Scanner(System.in);
		int n =r.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("sum: "+sum);
		
	}

}
