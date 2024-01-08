package array_learning;

import java.util.HashSet;

public class RemoveDuplicateEltFromArr {
	public static void main(String[] args) {
		int a[] = {4,6,7,7,9,1,1};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		}
		
	}


