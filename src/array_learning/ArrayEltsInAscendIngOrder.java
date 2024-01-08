package array_learning;

import java.util.Scanner;

public class ArrayEltsInAscendIngOrder {
	public static void main(String[] args) {
		System.out.println("Enter the array size:");
		Scanner r = new Scanner(System.in);
		int n = r.nextInt();
	
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		int temp;
		
		for(int i=0;i<n;i++) {
			arr[i]=r.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}
