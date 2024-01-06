package lec11Array2;
import java.util.*;
public class MovePositive {
	public static void movePositive(int a[]) {
	int nonNeg=0;
	
	int n=a.length;
	for(int i=0;i<n;i++) {
		if(a[i]<0) {
			a[nonNeg++]=a[i];
		}
	}
	
	while(nonNeg<n) {
		//a[nonNeg++]=;
		
	}
	}
	public static void main(String[] args) {
		int a[]= {2,4,-8,-9,5,-1};
		movePositive(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
