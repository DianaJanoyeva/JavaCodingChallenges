package JavaLogicalQuestions;

import java.util.Arrays;

public class ArrayReverse_Boolean {
	public static boolean[] reverseArray(boolean[] arr) {
		boolean[] reversedArray = new boolean[arr.length];
		int index = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			reversedArray[index] = arr[i];
			index++;
		}
		return reversedArray;
	}
	
	
	
	
	public static void main(String[] args) {
		boolean[] arrayOfBoolean = {true,false,true,true,false};
		boolean[] arrayResult = (reverseArray(arrayOfBoolean));
		System.out.println(Arrays.toString(arrayResult));
	}

}