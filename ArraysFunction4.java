package lec09Array;

public class ArraysFunction4 {
	public static int[] change(int input[]) {
		input=new int[5];
		input[0]=15;
		return input;
	}

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr=change(arr);
		System.out.println(arr[0]);
		// TODO Auto-generated method stub

	}

}
