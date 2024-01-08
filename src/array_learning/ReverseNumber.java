package array_learning;

import java.util.Scanner;

public class ReverseNumber{
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		while(n>0) {
		int r = n%10;
		System.out.print(r);  //123%10=3 is printed
		n = n/10;         //n/10=12 is stored
		}
		
	}

}
