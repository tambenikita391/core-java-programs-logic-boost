package array_learning;

import java.util.Scanner;

//0 1 1 2 3 5 8 13 _ _ _ _ 

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int n, a=0, b=1, c;
		System.out.println("Enter the number:");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=0;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
