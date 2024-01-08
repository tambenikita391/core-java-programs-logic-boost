package array_learning;

import java.util.Scanner;

public class ReveseWordsInString {
	public static void main(String[] args) {
		
		System.out.println("Ener any string:");
		Scanner r = new Scanner(System.in);
		String str = r.nextLine();
		
		String a[] = str.split(" ");
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}
