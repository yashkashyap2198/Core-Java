package lec11Array2;
import java.util.*;
public class SeachX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=s.nextInt();
		System.out.println("Enter the cols");
		int cols=s.nextInt();
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int x=s.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==x) {
					System.out.println("x found at location(" +i+","+j+")");
				}
			}
		}
	}

}
