package PracticingJava;

import java.util.Arrays;

public class ArrayOfNumLoop {
	//static int [] result= new int[2];

		public static void main(String[] args) {
		/*Given an array of integers nums and an integer target, return indexes of the two numbers such that they add up to target.
		You may assume that each input would have exactly one solution, and you may not use the same element twice.
		You can return the answer in any order.
		Example 1:
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
			int[] nums = {2,7,11,15};
			int target = 9;
			System.out.println(Arrays.toString(arrayOfNum(new int[] {2,7,11,15},target)));
		
		}		
		
			static int[] arrayOfNum(int[] nums, int target){
				int [] result= new int[2];
				
				for(int i = 0; i <=nums.length-2; i++) {
					for(int j = i+1; j <=nums.length-1; j++) {
						if(nums[i]+nums[j] ==target) {
							
						    result[0] = i; result[1] = j;
																																				
							
							//return new int[] {i,j};
						}
					}
				
				}
				return result;
	}
			
		}	