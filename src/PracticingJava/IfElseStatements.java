package PracticingJava;

import java.util.Arrays;

public class IfElseStatements {

	public static void main(String[] args) {
		// Create a function that returns true when x is equal to y; otherwise return false.
		System.out.println(isSameNum(7,10));
		System.out.println(lessThanOrEqualToZero(5));
		System.out.println(addition(5));
		int[] arr = {5,6,7,8,9,9};
		System.out.println(cons(arr));
		int[] arr1 = {56,54,52,50,51,55,53};
		System.out.println(cons1(arr1));
	}
	
	public static boolean isSameNum(int x, int y) {
		if (x==y) {
			return true;
		}else {
			return false;
		}
	}
/*Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.*/	
		static boolean lessThanOrEqualToZero(int num) {
			if(num <=0) {
				return true;
			}else {
				return false;
			}
		}
//Create a function that takes a number as an argument, increments the number by +1 and returns the result.		
		static int addition(int num1) {
			return ++num1;
		}


/*Create a function that determines whether elements in an array can be re-arranged to 
form a consecutive list of numbers where each number appears exactly once.*/
		static boolean cons(int[] arr) {
			Arrays.sort(arr);
			for (int i = 0; i<=arr.length-1;i++) {
				if(arr[i]+1!=arr[i+1]) return false;
			}
			return true;
		}
		
		public static boolean cons1(int[] arr1) {
			Arrays.sort(arr1); //50,51,52,53,54,55,56
			int low = arr1[0]; int high = arr1[arr1.length-1]; 
				int	sum = 0; int total = 0;

			    for(int i = arr1[low]; i <= arr1[high]; i++){
			    	sum = sum + i; //371
			    }
			    
			    for(int i = low; i <= high; i++){
			    	total = total + arr1[i];

			    }
			    return (total == sum);
		}
}
