package lec11Array2;
import java.util.*;
public class Array2dFunction {
	public static int[][] takeInput(){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the element of rows");
		int rows= s.nextInt();
		System.out.println("Enter the element of cols");
		int cols=s.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	public static void print(int arr[][]) {
		int rows=arr.length;
		int cols=arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	//	int arr[][]= {{4,5,6},{7,8,9}};
	//	print(arr);
		int input[][]=takeInput();
		print(input);
	}

}
