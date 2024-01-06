package lec09Array;

public class ArraysFunction2 {
	public static void printArray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] incrementArray(int[] input) {
		input=new int[7];
		for(int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		arr=incrementArray(arr);
		printArray(arr);
		//System.out.println(arr);
	}

}
