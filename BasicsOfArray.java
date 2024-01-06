package lec09Array;

public class BasicsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];	//declaration of array
		arr[0]=4;					//indexes of array
		arr[5]=7;
		System.out.println(arr[0]);
		System.out.println(arr[5]);
	//	arr[-1]=9;		minus indexing are not allowed;
		// arr[10]=3;		indexing number is over;
	//	System.out.println(arr[1]);
	//	System.out.println(arr[4]);
		char[] cArray=new char[1];
		double[]dArray=new double[7];
		System.out.println(cArray[0]);		//null output
		System.out.println(dArray[0]);
	}

}
