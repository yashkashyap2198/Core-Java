package lec09Array;
import java.util.Scanner;
public class InputsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element at"+i+"th indexes");
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
