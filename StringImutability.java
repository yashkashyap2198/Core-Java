package lec12String;

public class StringImutability {

	public static void main(String[] args) {
//		String str="abc";
//		String str1="abc";
//		str1=str1+"def";		//allowed
//		System.out.println(str1);
//	//	str.setCharAt(i)='i'; //not changed String because of immutable 
		String str1="abc";
	//	String str2="bc";
		// String str3="ab"+str2;
		String str2=str1+"";
		System.out.print(str1==str2);
	}

}
