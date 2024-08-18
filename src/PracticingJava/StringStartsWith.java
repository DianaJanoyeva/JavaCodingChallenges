package PracticingJava;

public class StringStartsWith {
	/*For a given input string, return a Boolean TRUE if the string starts with a given input word. 
	* So, for an input string of “hello world” and input word “hello,” the program should return TRUE.*/
	 
	static boolean startsWith(String str, String word) {
		
		if(str.startsWith(word)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		String str = "Hi how are you?";
		String word = "How";
		System.out.println(startsWith(str,word));
	}

}
