package lec09Array;
import java.util.*;
public class Practice3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] num=new int[n]; 
		for(int i=0;i<n;i++) {
			num[i]=s.nextInt();
		}
			//print the numbers in array
			for(int i=0;i<n;i++) {
				System.out.print(num[i]+" ");
			}
		
		// TODO Auto-generated method stub

	}

}
