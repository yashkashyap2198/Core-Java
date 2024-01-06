package lec11Array2;

public class SumOf2dArr {
	//public static int func(int arr[][]) {
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				sum+=arr[i][j];
//			}
//		}
//		return sum;
//	}
//
//	public static void main(String[] args) {
//		int arr[][]= {{0,1,2,4,5},{3,4,5,6,7},{5,6,7,8,9}};
//		System.out.println(func(arr));
		public static void fun(int arr[][]) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=2*i+j;
				}
			}
		}
		public static void main(String[] args) {
		int arr[][]=new int[2][2];
		fun(arr);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
	}

}
}
