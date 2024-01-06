package lec09Array;

public class NonPrimitiveDataType {

	public static void printArray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void incrementArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5};
		incrementArray(arr);
		printArray(arr);
		

	}

}
