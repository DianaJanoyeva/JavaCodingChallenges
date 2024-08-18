package PracticingJava;

public class ReturnBoom {
	//Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears 
	//in the array. Otherwise, return "there is no 7 in the array".	
		public static void main(String[] args) {
			int number = 756;
			System.out.println(containsSeven(number));
			
			int[] arr = {1, 2, 3, 4, 5, 6, 7};
			System.out.println(sevenBoom(arr));
		}
		
		public static String sevenBoom(int[] arr) {
			
			for (int i = 0; i<= arr.length-1; i++) {
				if(containsSeven(arr[i])) {
					return "Boom!";
				}
			}
			
			return "there is no 7 in the array";
		}

//		public static boolean containsSeven(int number) {
//			
//			return String.valueOf(number).contains("7");
//		}


	//Another way to solve this problem

		public static boolean containsSeven(int number) {
			while (number !=0) {
				int lastDigit = number % 10;
				if(lastDigit ==7) {
					return true;
				}
				number = number/10;
			}
			return false;
		}

	}
