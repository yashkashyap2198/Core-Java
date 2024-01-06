package lec11Array2;
import java.util.*;
public class TranposeMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=s.nextInt();
		System.out.println("Enter the number of rows");
		int m=s.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		for(int j=0;j<m;j++) {
			for(int i=0;i<n;i++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
