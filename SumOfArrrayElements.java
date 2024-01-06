package lec09Array;
import java.util.*;
public class SumOfArrrayElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		//System.out.println("Enter n");
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			System.out.print(a[i]+",");
		}
		
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println("\n"+ sum);
		
		// TODO Auto-generated method stub

	}

}
