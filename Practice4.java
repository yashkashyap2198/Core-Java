package lec09Array;
import java.util.*;
public class Practice4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String names[]=new String[n];
		
		// for input
		for(int i=0;i<n;i++) {
		names[i] =s.next();
		}
		// for output
		for(int i=0;i<n;i++) {
			System.out.println("names "+(i+1)+"is: "+names[i]);
		}
		// TODO Auto-generated method stub

	}

}
