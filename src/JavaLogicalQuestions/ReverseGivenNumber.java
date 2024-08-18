package JavaLogicalQuestions;

public class ReverseGivenNumber {
	//This one is a technical interview favorite. For a given input number, return the number in reverse. So, an input of 3956 should return 6593.	
	
		static int reverseNum(int num) {
			
			String str = Integer.toString(num); //"3956"
			String reversedString = "";
			for(int i = str.length()-1; i>=0; i--) {
				reversedString = reversedString + str.charAt(i);
				
			}
			
			int strToInt = Integer.parseInt(reversedString);
			return strToInt;
		
		}
		
		
		public static void main(String[] args) {
			int num = 3956;
			System.out.println(reverseNum(num));
		}

	}
