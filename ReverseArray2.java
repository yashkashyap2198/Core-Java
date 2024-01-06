package lec11Array2;
import java.util.*;
public class ReverseArray2 {
	public static int[]arraysRotation(int a[]){
		int li=0;
		int ri=a.length-1;
		int ra[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(li>=0&&ri>=0) {
				ra[i]=a[ri];
				ri--;
			}else {
				ra[i]=a[i];
			}
		}
		return ra;
	}
	
	public static void main(String[] args) {
		int a[]={2,4,7,8,3};
		
		
		int ra[]=arraysRotation(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(ra[i]+" ");
		}
			


			}
	
}
