package lec11Array2;
import java.util.*;
public class LargestColsSum {
	public static int[][] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the elements of rows");
		int rows=s.nextInt();
		System.out.println("Enter the elements of cols ");
		int cols=s.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	public static int maxColsSum(int arr[][]) {
		int max=Integer.MIN_VALUE;
		int rows=arr.length;
		int cols=arr[0].length;
		for(int j=0;j<rows;j++) {
			int sum=0;
			for(int i=0;i<cols;i++) {
				sum+=arr[i][j];
			}
			if(sum>max) {
				max=sum;
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		int arr[][]=takeInput();
	//	print(arr);
			System.out.println("max cols sum "+maxColsSum(arr));
		
		

	}

}
