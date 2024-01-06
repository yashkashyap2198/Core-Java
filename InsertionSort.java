package lec09Array;

public class InsertionSort {
	public static void insertionSort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int curr=a[i];
			int j=i-1;
			while(j>=0 && a[j]>curr) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=curr;
		}
	}

	public static void main(String[] args) {
		int a[]= {7,5,9,8,-3,4};
		insertionSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
