package lec11Array2;
import java.util.*;
public class SumTwoArrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		int sum[]=new int[n1+n2];
		for(int i=0;i<n1;i++) { 
			a1[i]=s.nextInt();
			//System.out.print("Enter the n1 and a1");
		
	for( int j=0;i<n2;j++) { 
		a2[j]=s.nextInt();
		//System.out.print("Enter the n2 and a2");
	
	for(int k=0;k<n1+n2;k++) { 
		sum[k]=a1[i]+a2[j];
		System.out.print(sum[k]+" ");
		}
	
	}
		// TODO Auto-generated method stub

	}
	}
}

