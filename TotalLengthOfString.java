package lec12String;
import java.util.*;
public class TotalLengthOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	//	System.out.println("Enter the string");
	//	String str=s.next();
		int n=s.nextInt();
		int arr[]=new int[n];
		int totLength=0;
		for(int i=0;i<n;i++) 
		//	arr[i]=s.nextInt();
			totLength+=arr.length;
		
		System.out.println(totLength);
	}

}
