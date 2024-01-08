package array_learning;

import java.util.Scanner;

public class CountVowAndConso {
	public static void main(String[] args) {
		
		int vowel=0, consonant=0;
		System.out.println("Enter any word: ");
		Scanner r = new Scanner(System.in);
		
		String st = r.nextLine();
		String str = st.toUpperCase() ;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='A' || ch=='E'|| ch=='I' || ch=='O'|| ch=='U') {
				vowel++;
			}else {
				consonant++;
			}
		}
		System.out.println("Vowels: "+vowel);
		System.out.println("Consonants: "+consonant);
		
		
	}

}
