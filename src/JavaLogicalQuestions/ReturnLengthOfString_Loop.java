package JavaLogicalQuestions;

public class ReturnLengthOfString_Loop {
	/* Given an array of strings and a integer which is the index
	Input: ["Diana", "Simon", "Victor", "Luba", "Disea"] and index = 3
	Return the length of the string at the provided index

	Output: 4 because at the index 3 is Luba string that has length 4

	Static int returnLength(int index) {
	  }*/
			public static int returnLength(String[] arr, int index) {
				int len = arr[index].length();
				
				return len;
			
				 
				
			}
		
	
	public static void main(String[] args) {
			String[] arrayOfStr = {"Diana", "Simon", "Victor", "Luba", "Disea"};
			System.out.println(returnLength(arrayOfStr,3));

		}

	}
