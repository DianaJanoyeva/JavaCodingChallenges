package JavaLogicalQuestions;

import java.util.Arrays;

public class ArrayReverse_Int {
//Write a method that will take an array as an argument and reverse it
		public static int[] reverseInt(int[] arr) {
			int[] reversedInt = new int[arr.length];
			int a = 0;
			for(int i = arr.length-1; i>=0; i--) {
				reversedInt[a] = arr[i];
				a++;
			}
				return reversedInt;
			}
		

		
		
		
	public static void main(String[] args) {
		int[] arrayOfInt = {1,2,3,4,5};
		System.out.println(Arrays.toString(reverseInt(arrayOfInt)));
		}

	}