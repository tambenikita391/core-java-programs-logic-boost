package array_learning;

public class LargestElt{
	public static int printElt(int a []) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String [] args) {
		int arr[] = {3,6,1,9,66};
		System.out.println(printElt(arr));
	}
	
}
