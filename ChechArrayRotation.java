package lec11Array2;

public class ChechArrayRotation {
	public static int linearRotation(int a[],int n) {
		int min=a[0];
		int mindx=0;
		for(int i=0;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
				mindx=i;
			}else {
				mindx=n-1;
			}
		}
		return mindx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,40,80,50};
		int n=a.length;
		System.out.println(linearRotation(a,n));
	}

}
