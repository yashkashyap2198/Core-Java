package lec12String;
import java.util.*;
public class ReplaceChar2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='@') {
				break;
			}else {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);

	}

}
