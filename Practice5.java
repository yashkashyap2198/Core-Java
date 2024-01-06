package lec09Array;
import java.util.*;
public class Practice5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=s.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
				for(int i=0;i<n;i++) {
					if(nums[i]<min) {
						min=nums[i];
					}else {
						max=nums[i];
					}
				}
				System.out.println(max);
				System.out.println(min);
				
		// TODO Auto-generated method stub

	}

}
