package lec11Array2;
import java.util.*;
public class SecLargest {

	public static void main(String[] args) {
		int a[]= {4,8,7,9,-7,8};
		int n=a.length;
		
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			
			if(a[i]>max) {
				secMax=max;
				max=a[i];
			}
			if(a[i]<max&&a[i]>secMax) {
				secMax=a[i];
			}
		}
		System.out.println("Second max " +secMax);
		}
		}

