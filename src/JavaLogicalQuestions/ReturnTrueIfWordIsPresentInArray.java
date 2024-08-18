package JavaLogicalQuestions;

public class ReturnTrueIfWordIsPresentInArray {
	/*Given an array of Strings and a word 
Return true if the word is present in the array and return false if it is not present*/
		
		public static boolean returnValue(String[] arr, String word) {
			
			for(int i = 0; i<= arr.length-1; i++) {
				if(arr[i].equals(word)) {
					return true;
				}
				
			}
			return false;
		}
		
	
			
	
	public static void main(String[] args) {
		String[] arrayOfStr = {"Michael","Simon","Inna","Kate","Vicu"};
		String word = "Simon";
		System.out.println(returnValue(arrayOfStr,word));
	}

}




