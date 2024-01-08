package array_learning;
//2^3=2*2*2

import java.util.Scanner;

public class PowerOfNo {
	public static void main(String[] args) {
		
		System.out.println("Enter any number:");
		Scanner r = new Scanner(System.in);
		int a = r.nextInt();
		
		System.out.println("Enter power:");
		int p = r.nextInt();
		int result = 1;
		
		for(int i=1;i<=p;i++) {
			result = a*result;	
		}
		System.out.println("reult: "+result);
		
	}

}
