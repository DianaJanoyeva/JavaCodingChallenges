package JavaCodingChallenges;

public class ReturnTrueIfFirst2Chars {
    //Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
//frontAgain("edited") → true
//frontAgain("edit") → false
//frontAgain("ed") → true
    public static boolean frontAgain(String word) {
        String firstTwoWords = word.substring(0, 2);
        String lastTwoWords = word.substring(word.length() - 2);

        if (firstTwoWords.equals(lastTwoWords)) {
            return true;
        } else {
            return false;
        }

    }
        public static void main (String[] args){
            String word = "edited";
            System.out.println(frontAgain(word));
        }
    }
