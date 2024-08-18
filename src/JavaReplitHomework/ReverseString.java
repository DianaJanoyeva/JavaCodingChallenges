package JavaReplitHomework;

public class ReverseString {
//String reverse. Write a method that will take one string as an argument and will return the reverse version of this string. (without StringBuilder)
	 public static String reverseStr(String word) {
		 String reversedStr = "";
		 for(int i = word.length()-1; i>=0; i--) {
			 reversedStr = reversedStr + word.charAt(i);
			 
		 }
		return reversedStr;
		 
	 }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String word = "Love";
		System.out.println(reverseStr(word));
	}

}
