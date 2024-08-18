package JavaLogicalQuestions;

public class ReturnFirstAndLastChar {
/*Given a string and an int n, return a string made of the first and last n chars from the string. 
 The string length will be at least n.
nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"*/

		public static String nTwice(String word, int n) {
			String firstStr = word.substring(0, n);
			
			String lastStr = word.substring(word.length()-n);
			
			String newWord = firstStr + lastStr;
			return newWord;
			
			
			}
			
		
	
	
	
	
	
	
	
		public static void main(String[] args) {
			String word = "Chocolate";
			int n = 3;
		System.out.println(nTwice(word, n));
	}

}
