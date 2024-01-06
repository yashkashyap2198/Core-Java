package lec11Array2;

public class MoreAbout2dArray {

	public static void main(String[] args) {
		int arr2[][]= {{1,2,4},{4,5,8}};
		System.out.println(arr2);
		System.out.println(arr2[0]);		//print 1d address 
		System.out.println(arr2.length);
		for(int i=0;i<2;i++) {
			System.out.println(arr2[i].length);
		}
	}

}
