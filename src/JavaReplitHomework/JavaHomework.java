package JavaReplitHomework;

import java.util.Arrays;

public class JavaHomework {

	public static void main(String[] args) {
//Task 1
		int[] arrayNums = {1,3,5,7,9};
		System.out.println("index 0 is " + arrayNums[0]);
		System.out.println("index 1 is " + arrayNums[1]);
		System.out.println("index 2 is " + arrayNums[2]);
		System.out.println("index 3 is " + arrayNums[3]);
		System.out.println("index 4 is " + arrayNums[4]);
	
//Task 2
		int[] scores = new int[5];
		scores[0] = 70;
		scores[1] = 98;
		scores[2] = 83;
		scores[3] = 74;
		scores[4] = 94;
		
		//System.out.println(scores[0] + " " + scores[1] + " " + scores[2] + " " + scores[3] + " " + scores[4]);
		System.out.println(Arrays.toString(scores));
		
		
		int sum = Arrays.stream(scores).sum();
		
		
		int averageScore = sum / scores.length;
		
		
		System.out.println("The average score was: " + averageScore);
		
// Task 3
		String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		Arrays.sort(weekDays);
		
		
		
		for(String day : weekDays) {
		System.out.println(day);
			
		}

// Task 4
		int[] arrayNum1 = {1,3,5,7,9};
		int[] arrayNum2 = {2,4,6,8,10};
		
		
		if(Arrays.equals(arrayNum1, arrayNum2)) {
			System.out.println("We have a match");
		}else {
			System.out.println("We don't have a match");
		}
		
// Task 5
		int[] arrayOfNums = {21, 25, 18, 42, 23, 34, 20};
		
		int resultOfIndex = Arrays.binarySearch(arrayOfNums, 21);
		
		System.out.println(resultOfIndex);
		
		Arrays.sort(arrayOfNums); //{18, 20, 21, 23, 25, 34, 42}
		
		
		
		int[] copiedArray = Arrays.copyOf(arrayOfNums, arrayOfNums.length);
		
		boolean comparisonArrays = Arrays.equals(arrayOfNums, copiedArray);
		
	}

}
