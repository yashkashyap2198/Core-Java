package lec11Array2;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int[4][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[i+2];
		}
		
		// for print the Jagged array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[0][0]);
			}
			System.out.println();
		}
	}

}
