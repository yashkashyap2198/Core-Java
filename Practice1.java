package lec12String;

public class Practice1 {

	public static void main(String[] args) {
//		String a="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
		String a="coding",b="ninjas";
		if(a.contains("ing")) {
			a+=b;
		}else {
			b+="ing";
		}
		System.out.println(b+a);
	}

}
