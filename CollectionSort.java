package sorting;

import java.util.Arrays;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		Integer arr[]= {2,5,7,8,9,3};
		Arrays.sort(arr,Collections.reverseOrder());  //for decending order
		System.out.printf(Arrays.toString(arr));
	}

}
