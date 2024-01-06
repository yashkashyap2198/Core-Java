package lec11Array2;
import java.util.*;
public class MoveZero {
	public static void moveZero(int a[]) {
		int nonZero=0;
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) { 
				a[nonZero++]=a[i];
			}
		}
			while(nonZero<n) {
				a[nonZero++]=0;
			}
	}
	

	public static void main(String[] args) {
		int a[]= {2,4,0,5,0,7,0,1};
		moveZero(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
