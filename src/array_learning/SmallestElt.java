package array_learning;

public class SmallestElt {
	
	public static int printElt(int a[]) {
		int min = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String [] args) {
		int arr[] = {3,6,9,1};
		System.out.println(printElt(arr));
	}

}
