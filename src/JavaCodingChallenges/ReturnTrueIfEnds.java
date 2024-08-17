package JavaCodingChallenges;

public class ReturnTrueIfEnds {
//Given a string, return true if it ends in "ly"
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false
    public static boolean endsWithLy(String word){

        if(word.endsWith("ly")){
            return true;
        }
        return false;
    }



    public static void main(String[] args){
        String word = "oddly";
        System.out.println(endsWithLy(word));
    }
}
