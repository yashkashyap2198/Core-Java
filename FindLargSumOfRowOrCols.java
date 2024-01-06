package lec11Array2;
	import java.util.*;
public class FindLargSumOfRowOrCols {
	public static void findMaxSum(int arr[][]) {
		int rows=arr.length;
		int cols=arr[0].length;
		int q=0;
		String s="";
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<rows;i++){
 			int sum=0;
 			for(int j=0;j<cols;j++){
 				sum+=arr[i][j];
 			}
 			if(sum>max1){
 				max1=sum;
 				q=i;
 				s="rows";
 			}
 			}
		int max2=Integer.MIN_VALUE;
		for(int j=0;j<rows;j++){
 			int sum=0;
 			for(int i=0;i<cols;i++){
 				sum+=arr[i][j];
 			}
 			if(sum>max2){
 				max2=sum;
 				q=j;
 				s="cols";
 			}
 			}
		if(max1>=max2) {
			System.out.println(s+" "+q+" "+max1);
		}else {
			System.out.println(s+" "+q+" "+max2);
		}
	}

	public static void main(String[] args) {
		int arr[][]= {{2,4,7},{7,8,9},{20,8,9}};
		findMaxSum(arr);

	}

}
