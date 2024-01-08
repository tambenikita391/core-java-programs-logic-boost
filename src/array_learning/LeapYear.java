package array_learning;

import java.util.Scanner;

//century (100%=0 and 400%=0) e.g 2000, 4000
//Yearly (100%!=0 and 4%=0) 2020,2024

public class LeapYear {
	public static void main(String[] args) {
		
		System.out.println("Enter year");
		Scanner r = new Scanner(System.in);
		int y = r.nextInt();
		
		if(y%4==0 && y%100!=0 || y%400==0 && y%100==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not leap year");
		}
		
	}

}
