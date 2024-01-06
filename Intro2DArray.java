package lec11Array2;

public class Intro2DArray {

	public static void main(String[] args) {
		int arr2D[][]=new int[3][4];
		System.out.println(arr2D[1][2]);
		arr2D[2][2]=7;
		System.out.println(arr2D[2][2]);
		//another way declaration
		int arr2d[][]= {{1,2,4},{2,5,7}};
	}

}
