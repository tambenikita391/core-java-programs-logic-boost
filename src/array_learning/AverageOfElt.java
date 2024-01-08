package array_learning;

import java.util.Scanner;

public class AverageOfElt {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter range of no. ");
		Scanner r = new Scanner(System.in);
		int n = r.nextInt();
		
		for(int i=1;i<=n; i++) {
			sum+=i;
		}
		float avg = sum/n;
		System.out.println("AVG :"+avg);
		
		
	}

}
