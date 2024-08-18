package JavaLogicalQuestions;

public class StringLengthAtIndex {
	/*Given an array of strings and a integer which is the index
	Input: ["Diana", "Simon", "Victor", "Luba", "Disea"] and index = 3
	Return the length of the string at the provided index

	Output: 4 because at the index 3 is Luba string that has length 4*/
			public static int returnLength(String[] arr, int index) {
				int result = 0;
				for(int i = 0; i<= arr.length-1; i++) {
					if(i == index) {
						result = arr[index].length();
					}
				}
				return result;
			}
			
			public static int returnLengths(String[] arrayOfStr, int index) {
				return arrayOfStr[index].length();
			}
	
	
		
		
		public static void main(String[] args) {
			String[] arrayOfStr = {"Diana", "Simon", "Victor", "Luba", "Disea"};
			int index = 3;
			System.out.println(returnLength(arrayOfStr,index));
			
			String[] arrayOfNames = {"Diana", "Simon", "Victor", "Luba", "Disea"};
			int indexes = 3;
			System.out.println(returnLength(arrayOfNames,indexes));
		}

	}
