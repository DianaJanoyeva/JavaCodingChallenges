package JavaLogicalQuestions;

public class ReturnNumInReverse {
//This one is a technical interview favorite. For a given input number, return the number in reverse. 
//So, an input of 3956 should return 6593.
			public static int reverseNum(int num) {
			String numToStr = Integer.toString(num);
			String reversedStr = "";
			for(int i = numToStr.length()-1; i>=0; i--) {
				reversedStr = reversedStr + numToStr.charAt(i);
				
			}
				int result = Integer.parseInt(reversedStr);
				return result;
			}
	
	
	
	
	
	
		public static void main(String[] args) {
			int num = 3956;
			System.out.println(reverseNum(num));
		}

}
