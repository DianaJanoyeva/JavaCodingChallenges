package PracticingJava;

public class LoopPractice {
	/*Given an array of Strings and a word 
	Return true if the word is present in the array and return false if it is not present*/
		
		static boolean wordIsPresent(String[] arrayOfStrings, String word) {
			
			for(int i = 0; i<=arrayOfStrings.length-1; i++) {
				if(arrayOfStrings[i].equals(word)) {
					return true;
				}
			}
			return false;
		}
		
		
		
		public static void main(String[] args) {
			 String[] arrayOfStrings = {"Diana", "Iliev", "Simon", "Inna","Nastas"};
			 String word = "Iliev";
			 System.out.println(wordIsPresent(arrayOfStrings,word));
		}

	}
		