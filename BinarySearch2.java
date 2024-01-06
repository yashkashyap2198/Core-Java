package lec10SeachingAndSorting;

public class BinarySearch2 {
	public static int binarySearch(int a[],int n,int x) {
		int start=0,end=n-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==x) {
				return mid;		//element found
			}
			else if(x<a[mid]){		//x is found in left side
				end=mid-1;
				
			}else {
				start=mid+1;		//x is found in right side
			}
			
		}
		return -1;		//element is not found
	}

	public static void main(String[] args) {
		int a[]= {2,4,5,6,8,7,9};
		int n=a.length;
		int x=9;
		System.out.print(binarySearch(a,n,x));		//print index
		// TODO Auto-generated method stub

	}

}
