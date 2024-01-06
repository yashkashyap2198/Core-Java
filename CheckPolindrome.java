package lec12String;
import java.util.*;
public class CheckPolindrome {
	
		
	public static void main(String[] args) {
		String str="madam";
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Polindrome");
			
		}else {
			System.out.println("not a Polindrome");
		}
	}
}

	


