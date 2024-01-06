package lec11Array2;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element of array");
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]>max) {
				secMax=max;
				max=a[i];
			}
			if(a[i]<max&&a[i]>secMax) {
				secMax=a[i];
			}
			
	}
		System.out.println("Second max "+secMax);
		
	}
		// TODO Auto-generated method stub

	}


