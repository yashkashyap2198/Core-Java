package lec09Array;

public class ArraySwap {
	public static void swapArray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			System.out.println(arr[i]);
			i=i+2;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr= {1,2,4,7,5};
			swapArray(arr);
	}

}
