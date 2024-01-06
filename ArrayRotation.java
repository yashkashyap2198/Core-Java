package lec11Array2;
import java.util.*;
public class ArrayRotation {
	public static void rotateArray(int arr[],int n,int r) {
		  int p=1;
		  while(p<=r) {
			  
		  int temp=arr[0];
		  for(int i=0;i<n-1;i++) {
			  
			  arr[i]=arr[i+1];
		  }
		  arr[n-1]=temp;
		  p++;
		  }
		  
	}

	public static void main(String[] args) {
		int arr[]= {2,4,8,7,9,6};
		int n=arr.length;
		int r=4;
		rotateArray(arr,n,r);
		System.out.println("Rotated array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
