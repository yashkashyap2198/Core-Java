package lec11Array2;
import java.util.Scanner;
public class InputMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=s.nextInt();
		System.out.println("Enter the cols");
		int cols=s.nextInt();
		//for input
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			//	System.out.println("Enter element at (i,j)");
				arr[i][j]=s.nextInt();
			}
		}
		//for output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
