package JavaLogicalQuestions;

public class ReverseWords {
	//Write a method that will take a string as an argument. The method will reverse the position of words and return it.
	public static String reverseStr(String words) {
		String[] arr = words.split(" "); //["I","love","Simon"]
		String reversedWords = "";
		for(int i = arr.length-1;i>=0;i--) {
			reversedWords = reversedWords + arr[i]; //"I","love","Simon"
			reversedWords = reversedWords + " "; // "Simon love I"
		}
		return reversedWords;
	}
	
	
	
	
	public static void main(String[] args) {
		String strs = "I love Simon";
		System.out.println(reverseStr(strs));
		
		
	}

}
