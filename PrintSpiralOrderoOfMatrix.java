package lec11Array2;
import java.util.*;
public class PrintSpiralOrderoOfMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=s.nextInt();
		System.out.println("Enter number of cols");
		int m=s.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=s.nextInt();
			}
		}
		int rs=0;
		int re=n-1;
		int cs=0;
		int ce=m-1;
		while(rs<=re&&cs<=ce) {
			for(int c=cs;c<=ce;c++) {
				System.out.print(mat[rs][c]+" ");
			}
			rs++;
			for(int r=rs;r<=re;r++) {
				System.out.print(mat[r][ce]+" ");
			}
			ce--;
			for(int c=ce;c>=cs;c--) {
				System.out.print(mat[re][c]+" ");
			}
			re--;
			for(int r=re;r>=rs;r--) {
				System.out.print(mat[r][cs]+" ");
			}
			cs++;
			System.out.println();
		}
	}

}
