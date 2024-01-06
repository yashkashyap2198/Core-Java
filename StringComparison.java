package lec12String;

public class StringComparison {

	public static void main(String[] args) {
		
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		if(str1.equals(str3)) {
			System.out.println("both are equal");  //they passes string
			}else {
				System.out.println("both are not equal");		
			}
			

			
		
//		int arr1[]= {1,2};
//		int arr2[]= {1,2};
//		if(arr1==arr2) {
//			System.out.println("both are equal");
//		}else {
//			System.out.println("both are not equal");		// because they passes address
//		}
//		System.out.println(arr1+" "+arr2);
		}

}
