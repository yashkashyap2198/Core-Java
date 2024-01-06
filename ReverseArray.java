package lec11Array2;
import java.util.*;
public class ReverseArray {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.print("Enter an element in array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.print("Array element ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print( "\n array in reverse order ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
