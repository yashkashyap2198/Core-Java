package lec12String;

public class ReversedString {
	public static String findRev(String str) {
		String revString="";
//		for(int i=str.length()-1;i>=0;i--) {
//			revString+=str.charAt(i);
//		}											// OR
		for(int i=0;i<str.length();i++) {
			revString=str.charAt(i)+revString;
		}
		return revString;
	}

	public static void main(String[] args) {
		String str="abcde";
		String ans=findRev(str);
		System.out.println(ans);
	}

}
