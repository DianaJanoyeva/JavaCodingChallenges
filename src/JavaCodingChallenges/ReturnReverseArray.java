package JavaCodingChallenges;

import java.util.Arrays;

public class ReturnReverseArray {
//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//reverse3([1, 2, 3]) → [3, 2, 1]
//reverse3([5, 11, 9]) → [9, 11, 5]
//reverse3([7, 0, 0]) → [0, 0, 7]
    public static int[] reverse3(int[] arr){
        int[] reversedArray = new int[arr.length];
        int index = 0;
        for(int i = arr.length-1; i>=0; i--){
            reversedArray[index] = arr[i];
            index++;
        }
        return reversedArray;
    }





    public static void main(String[] args) {
        int[] arrayOfNum = {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(arrayOfNum)));
    }

}
