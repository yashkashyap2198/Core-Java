package lec09Array;

public class MaxAndMinValue {
	

	public static void main(String[] args) {
		int a[]= {5,7,8,9,3};
		int n=a.length;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}else {
				min=a[i];
			}
			
		}
		System.out.println(max+" "+min);
		// TODO Auto-generated method stub

	}

}
