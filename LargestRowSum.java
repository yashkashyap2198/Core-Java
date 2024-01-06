package lec11Array2;
import java.util.*;
public class LargestRowSum {
	public static int[][] takeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=s.nextInt();
		System.out.println("Enter the number of cols");
		int cols=s.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	public static int largRowSum(int arr[][]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
		
			for(int j=0;j<arr[i].length;j++) {
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
		int maxSum=largRowSum(arr);
		System.out.println("Largest row sum "+maxSum);
	}

}
