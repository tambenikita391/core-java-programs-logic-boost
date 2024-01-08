package array_learning;

import java.util.Scanner;

public class CountWordsInString {
	public static void main(String[] args) {
		
		System.out.println("Enter any string :");
		Scanner r = new Scanner(System.in);
		String str = r.nextLine();
		
		String arr[] = str.split(" ");
		
		System.out.println("Numer of words in string :"+arr.length);
		
		//2nd approach
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Number of words in string : "+count);
		
		
	}
	
	
	

}
