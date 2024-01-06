package lec11Array2;

public class ArrayRotation1 {
//	public static void arrayRotation(int arr[],int n) {
//		int n=arr.length;
//		int temp=arr[0];
//		for(int i=0;i<n-1;i++) {
//			arr[i]=arr[i+1];
//			arr[i+1]=temp;
//		}
//	}

	public static void main(String[] args) {
		int a[]= {2,5,4,8,7};
		
		//arrayRotation(arr,n);
		int n=a.length;
		int temp=a[0];
		for(int i=0;i<n-1;i++) {
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0;i<n;i++ ) {
			System.out.print(a[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
