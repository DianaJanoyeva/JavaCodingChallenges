package JavaCodingChallenges;

import java.util.Arrays;

public class ReturnTrueIfNotContainsTwoOrThree {
//Given an int array length 2, return true if it does not contain a 2 or 3.
//no23([4, 5]) → true
//no23([4, 2]) → false
//no23([3, 5]) → false
    public static boolean no23(int[] arr){

        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] == 2 || arr[i] ==3){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arrOfNum = {4,5};
        System.out.println(no23(arrOfNum));
    }
}
