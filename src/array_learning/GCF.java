package array_learning;

import java.util.Scanner;

public class GCF {
	public static void main(String[] args) {
		
		System.out.println("Enter two numbers:");
		Scanner r = new Scanner(System.in);
		int a = r.nextInt();
		int b = r.nextInt();
		int g=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				g=i;
			}
		}
		System.out.println("GNF: "+g);
		
	}


}
