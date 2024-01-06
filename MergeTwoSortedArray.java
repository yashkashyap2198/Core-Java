package lec10SeachingAndSorting;
import java.util.*;
public class MergeTwoSortedArray {
	public static void  mergeTwoSortedArray(int a1[],int a2[]) {
		int n1=a1.length;
		int n2=a2.length;
		int a3[]=new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1) {
			
				a3[k++]=a1[i++];
		}
		while(n2>j) {
				a3[k++]=a2[j++];
				
			
		}
		Arrays.sort(a3);
		for( k=0;k<a3.length;k++) {
			System.out.print(a3[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		int a1[]= {2,4,1,5};
		int a2[]= {7,8,9,3,6};
		mergeTwoSortedArray(a1,a2);
		//System.out.print(a3[k]+" ");
		// TODO Auto-generated method stub

	}

}
