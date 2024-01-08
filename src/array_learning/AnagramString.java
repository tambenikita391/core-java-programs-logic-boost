package array_learning;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter first string :");
		String s1 = r.nextLine();
		
		System.out.println("Enter second string :");
		String s2 = r.nextLine();
		
		char c1[] = s1.toCharArray();	
		char c2[] = s2.toCharArray();
				
		if(c1.length!=c2.length) {
			System.out.println("Not anagram");
			System.exit(0);
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("Not anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
		
	}

}
