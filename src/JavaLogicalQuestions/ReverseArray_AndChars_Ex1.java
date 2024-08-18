package JavaLogicalQuestions;

import java.util.Arrays;

public class ReverseArray_AndChars_Ex1 {
	//reverse the order of strings in an array and also reverse the characters inside each string
			public static String[] reverseArray(String[] arr) {
				String[] reversedArray = new String[arr.length];
				int index = 0;
				for(int i = arr.length-1; i>=0; i--) {
					reversedArray[index] = arr[i];
					index++;
					
				}
					//[Carolina, Inna, Iliev, Michael, Katya] //reversedArray
					for(int i = 0; i <= reversedArray.length-1; i++) {  //i=Carolina j="a"
						String reversedString = "";
						for(int j = reversedArray[i].length()-1; j>=0; j--) {
							reversedString = reversedString + reversedArray[i].charAt(j);
						}
						
						reversedArray[i] = reversedString;
					}
					
				
				
				
				return reversedArray;
			}
			
		

		public static void main(String[] args) {
				String[] arrayOfStr = {"Katya","Michael","Iliev","Inna","Carolina"};
				String[] arrayResult = (reverseArray(arrayOfStr));
				System.out.println(Arrays.toString(arrayResult));
		
	}

	}

