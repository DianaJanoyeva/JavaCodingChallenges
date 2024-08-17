package JavaCodingChallenges;

public class ReturnTrueIfSixAppears {
//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//firstLast6([1, 2, 6]) → true
//firstLast6([6, 1, 2, 3]) → true
//firstLast6([13, 6, 1, 2, 3]) → false

    public static boolean arrayOfNum(int[] arr){

        if(arr[0] == 6 || arr[arr.length-1] == 6){
            return true;
        }else{
            return false;
        }

    }





    public static void main(String[] args){
                int[] arrayOfInt = {1, 2, 6};
                System.out.println(arrayOfNum(arrayOfInt));
    }
}
