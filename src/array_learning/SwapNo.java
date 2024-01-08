package array_learning;

import java.util.Scanner;

public class SwapNo {
	public static void main(String[] args) {
		
		System.out.println("Enter two numbers:");
		Scanner r = new Scanner(System.in);
		
		int a = r.nextInt();
		int b = r.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}

}
