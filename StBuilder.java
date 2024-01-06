package lec12String;
import java.util.*;
public class StBuilder {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("Yash");
			//char at index 0;
	//	System.out.println(sb.charAt(0));
		// set a char at index 0
//		sb.setCharAt(0,'P');
//		System.out.println(sb);
//		
//		sb.delete(1, 3);
//		System.out.println(sb);
		sb.append("oo");
		System.out.println(sb);
		System.out.println(sb.length());
	}

}
