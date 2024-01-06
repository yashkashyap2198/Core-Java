package lec09Array;

public class BubbleSort {
	public static void bubbleSort(int a[]) {
	//		Time complexity=O(n^2)
		//bubbleSort
		for(int i=0;i<a.length-1;i++) {		//outer loop
			for(int j=0;j<a.length-i-1;j++) {		//inner loop
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int a[]= {7,-9,-6,2,5};
		bubbleSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");// printing array
		}
		// TODO Auto-generated method stub

	}

}
