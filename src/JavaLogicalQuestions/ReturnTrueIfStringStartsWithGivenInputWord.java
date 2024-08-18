package JavaLogicalQuestions;

public class ReturnTrueIfStringStartsWithGivenInputWord {
/*For a given input string, return a Boolean TRUE if the string starts with a given input word. 
 So, for an input string of “hello world” and input word “hello,” the program should return TRUE.
*/
		public static boolean returnOutput(String str, String word) {
			
			if(str.startsWith(word)) {
				return true;
			}else {
				return false;
			}
			
		}
	
	
	
	
	
	
	
	
		public static void main(String[] args) {
			String str = "Hello world";
			String word = "Goodbye";
			System.out.println(returnOutput(str,word));
	
	}

}
