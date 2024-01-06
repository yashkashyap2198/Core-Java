package lec12String;

public class RemoveDublicate {
	public static String removeConsecutiveDuplicates(String str) {
		String res="";
		char ch=str.charAt(0);
		res+=ch;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				continue;
			}else {
				res+=str.charAt(i);
				ch+=str.charAt(i);
				
			}
		}
		System.out.print(res);
		return res;
	}

	public static void main(String[] args) {
		String str="aabbcca";
		removeConsecutiveDuplicates(str);

	}

}
