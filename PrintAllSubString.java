package lec12String;

public class PrintAllSubString {
	public static void printSubString(String str,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) 
				
			System.out.println(str.substring(i,j));
		}
	}

	public static void main(String[] args) {
		String str="pqrs";
		printSubString(str,str.length());

	}

}
