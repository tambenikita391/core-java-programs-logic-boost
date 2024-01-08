package array_learning;

public class StringPalindrome {
	
	public static boolean palindrome(String s) {
		for(int i=0;i<s.length()/2; i++) {
			if((s.charAt(i))==(s.charAt(s.length()-1-i))) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String [] args) {
		String str = "Madam";
		System.out.println(palindrome(str));
	}

}
