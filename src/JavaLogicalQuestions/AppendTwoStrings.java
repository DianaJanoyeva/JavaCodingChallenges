package JavaLogicalQuestions;


public class AppendTwoStrings {
//	Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are 
//	different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". 
//	The strings may be any length.
//	public String minCat(String a, String b)
	
	public static String minCat(String a, String b) {
//		String a = "Hello";
//		String b = "Home";
		String word = "";
		if(a.length() > b.length()) {
			word = a.substring(0, b.length());
			return word + b;
		}else {
			word = b.substring(0, a.length());
		}
		
		return word + a;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Home";
		System.out.println(minCat(a,b));
	}

}
