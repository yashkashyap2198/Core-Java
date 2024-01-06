package lec10SeachingAndSorting;
import java.util.*;
public class linearSearch {
	public static int[] takeInput() {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" th index");
		}
		return arr;
	}
	public static int printIndex(int[]arr) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==x) {
				return i;
			}
		}
		return-1;
	}

	public static void main(String[] args) {
		int[] arr= {2,5,7,8,9};
		//int[] arr=takeInput();
	  int indx=printIndex(arr);
	  System.out.println(indx);

		System.out.println(arr);

	}

}
