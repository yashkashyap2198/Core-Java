package lec09Array;

public class MaxMin {

	public static void main(String[] args) {
		int a[]= {2,3,8,6,7};
		int indx=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<5;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}else {
				max=a[i];
				
			}
		}
		System.out.println(min);
		
		System.out.println(max);
		
		
		}
		// TODO Auto-generated method stub

	}


