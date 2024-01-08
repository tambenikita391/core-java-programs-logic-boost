package array_learning;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElt {
	public static void main(String[] args) {
		int a[] = { 3, 7, 4, 1, 3, 1, 2, 4, 5, 5, 7, 6, 2, 6 };

		Arrays.sort(a);
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i+1]) {
				al.add(a[i]);

			}
		}
		al.add(a[a.length-1]);
		System.out.println(al);

	}

}
