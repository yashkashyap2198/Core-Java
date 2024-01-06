package lec09Array;
import java.util.*;
public class functionArray {
	public static void printArray(int[]arr) {
		int n=arr.length;		//size of the array
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	}
	public static int [] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element at"+i+"th index");
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[]arr=takeInput();	//	call to function for take input
		printArray(arr);		//call to function for printArray
		
	}

}
