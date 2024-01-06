package lec09Array;
import java.util.*;
public class MaxandMinValue2 {
	public static void maxMin(int a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=a.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			 a[i]=s.nextInt();
			 if(a[i]>max) {
				max=a[i]; 
			 }else {
				 min=a[i];
			 }
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		// TODO Auto-generated method stub

	}

}
