package JavaLogicalQuestions;

public class PrimeNumChecker {
/*Prime number checker
A prime number is any whole number greater than 1 whose only factors are 1 and itself. For example, 7 is a prime number
because it’s only divisible by 1 and 7.
Create a function that returns TRUE if an input number is prime. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19.*/	
	
		public static boolean returnTrue(int num) {
			if(num <= 1) {
				return false;
			}
			for(int i = 2; i < num; i++) {
				if(num % i != 0) { //if num divided by i has a remainder, then this is a prime number
					return true;
				}
				
			}
		
			return false; //If there is no remainder then this is not a prime number
		}
		public static void main(String[] args) {
			int primeNumber = 7;
			System.out.println(returnTrue(primeNumber));
		}

	}
