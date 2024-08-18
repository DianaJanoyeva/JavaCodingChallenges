package PracticingJava;

public class exercisingLoops {

public static void main(String[] args) {
		
//		String favoriteRestaurant = "Fogo De Chao";
//		int lengthOfString = favoriteRestaurant.length();
//		boolean isEmpty = favoriteRestaurant.isEmpty();
//		
//		for(int i = 0; i <= favoriteRestaurant.length()-1; i++) {
//			System.out.println("Index " + i + " is " + favoriteRestaurant.charAt(i));
//		} 
	
//		Scanner obj2 = new Scanner(System.in);
//		System.out.println("Enter a word or phrase to receive a character count(not including spaces): ");
//		String wordOrPhrase = obj2.nextLine();
//		
//		int characterCount = 0;
//		
//		for(int i = 0; i <= wordOrPhrase.length()-1; i++) {
//			if(wordOrPhrase.charAt(i) != ' ') {
//				characterCount++;
//				System.out.println("This word or phrase has " + characterCount + " characters");
//			
//		}
//		
//		}
//		Scanner obj3 = new Scanner(System.in);
//		System.out.println("Enter your favorite movie of all time: ");
//		String favoriteMovie = obj3.nextLine();
//		
//		int count = 0;
//		
//		for(int i = 0; i< favoriteMovie.length(); i++) {
//			if(favoriteMovie.charAt(i) == 'e') 
//				count++;
//				System.out.println("There are " + count + " in " + favoriteMovie);
//			} 
//		int[] numArray = {23,14,0,16,18,29};
//		Arrays.sort(numArray);
//		
//		int p = 0;
//		while(p <= numArray.length-1) {
//			System.out.println(numArray[p]);
//			p++;
//		}
		String[] appleColors = {"green", "red", "green", "green", "red", "green", "red", "red"};
		int green = 0;
		
		for(String appleColor : appleColors) {
			if(appleColor.equals("green")) {
				green++;
			}
			
		}
		System.out.println("There are " + green + " green apples");
	
	}
	}


