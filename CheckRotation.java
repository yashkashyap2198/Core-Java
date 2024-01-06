package lec11Array2;

public class CheckRotation {
	public static int rotateArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>a[i+1]) {
				return (i+1);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[]= {2,8,7,9,5};
		int res=rotateArray(a);
		
		System.out.println(res);
		
		// TODO Auto-generated method stub

	}

}
