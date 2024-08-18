package JavaLogicalQuestions;

import java.util.Arrays;

//Write a method that will take an array as an argument and reverse it
	public class ArrayReverse_String {
			
			public static String[] arrayOfNames(String[] arr) {
				
				String[] reversedArray = new String[arr.length];
				int index = 0;
				for(int i = arr.length-1; i>= 0; i--) {
					reversedArray[index] = arr[i];
					index++;
				}
				return reversedArray;
			}
		
	
	
	
	
	
	
		public static void main(String[] args) {
			String[] arrayOfStr = {"Kolya", "Marina","Dima", "Simion", "Larisa"};
			String[] reverseResult = (arrayOfNames(arrayOfStr));
			System.out.println(Arrays.toString(reverseResult));
			
		}
	
	}
	
	

	
	
	

