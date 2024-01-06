package lec10SeachingAndSorting;

public class SelecgtionSort {
	public static void selectionSort(int a[]) {
		//	Time complexity=O(n^2)
		//Selection sort
		for(int i=0;i<a.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[smallest]) {
					smallest=j;
				}
			}
			//swap the values
			int temp=a[smallest];
			a[smallest]=a[i];
			a[i]=temp;
		}
	}

	public static void main(String[] args) {
		int a[]= {2,8,7,6,9,4};
		selectionSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ ",");		// for printing the values
		}
		// TODO Auto-generated method stub

	}

}
