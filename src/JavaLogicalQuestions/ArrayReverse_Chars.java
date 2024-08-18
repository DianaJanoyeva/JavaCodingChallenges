package JavaLogicalQuestions;

import java.util.Arrays;

public class ArrayReverse_Chars {
	public static char[] reverseArray(char[] arr) {
		char[] reversedArray = new char[arr.length];
		int index = 0;
		for(int i = arr.length-1; i>=0; i--) {
			reversedArray[index] = arr[i];
			index++;
		}
		return reversedArray;
	}
	
	
	
	
	public static void main(String[] args) {
		char[] arrayOfChars = {'A','B','C','D','E'};
		char[] charArray = (reverseArray(arrayOfChars));
		System.out.println(Arrays.toString(charArray));
	}

}

