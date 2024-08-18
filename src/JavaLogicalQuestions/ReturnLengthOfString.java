package JavaLogicalQuestions;

public class ReturnLengthOfString {
	/* Given an array of strings and a integer which is the index
	Input: ["Diana", "Simon", "Victor", "Luba", "Disea"] and index = 3
	Return the length of the string at the provided index

	Output: 4 because at the index 3 is Luba string that has length 4

	Static int returnLength(int index) {
	  }*/
			public static int returnLength(String[] arr, int index) {
				
				return arr[index].length();
				
			}
	
	
	
	
	
	
	
	
		public static void main(String[] args) {
			String[] arrayOfStr = {"Diana", "Simon", "Victor", "Luba", "Disea"};
			int index = 3;
			System.out.println(returnLength(arrayOfStr, index));

	}

}
