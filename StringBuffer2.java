package lec12String;

public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("");
		for(int i=0;i<5;i++) {
			str.append((char)('a'+i));
		}
			System.out.println(str);
		
	}

}
