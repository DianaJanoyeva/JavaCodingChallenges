package JavaCodingChallenges;

public class ReturnTrueIfSameFirstandLastelement {
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//Both arrays will be length 1 or more.
//commonEnd([1, 2, 3], [7, 3]) → true
//commonEnd([1, 2, 3], [7, 3, 2]) → false
//commonEnd([1, 2, 3], [1, 3]) → true
    public static boolean commonEnd(int[] arr1, int[] arr2){

        if(arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length-1]){
            return true;
        }else{
            return false;
        }

    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3};
        System.out.println(commonEnd(arr1,arr2));
    }

}
