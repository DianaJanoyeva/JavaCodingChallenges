package JavaLogicalQuestions;

import java.util.Arrays;

public class ReverseArray_AndChars_Ex2 {
	//reverse the order of strings in an array and also reverse the characters inside each string - Another example
	
	public static String[] reverseArray(String[] arr) {
		
		String[] reversedArray = new String[arr.length];
		int index = 0;
		for(int i = arr.length-1;i>=0;i--) {
				reversedArray[index] = arr[i];
				index++;    //reversedArray = [Ion, Simon, Diana]
				
		}	
		
		for (int i = 0; i<reversedArray.length; i++) {
			char[] characters = reversedArray[i].toCharArray();
			
			int left = 0;
			int right = characters.length-1;
			
			
			while(left<right) {
				char temp = characters[left];
				characters[left] = characters[right];
				characters[right] = temp;
				left++;
				right--;
				
			}
			reversedArray[i] = new String(characters);
		}
		return reversedArray; //[Ion, Simon, Diana]
	}
	
	
	

	
	public static void main(String[] args) {
		String[] arrayOfStr = {"Diana","Simon","Ion"};
		System.out.println(Arrays.toString(reverseArray(arrayOfStr)));
		
	}

}

