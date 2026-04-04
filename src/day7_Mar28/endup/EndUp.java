package day7_Mar28.endup;

public class EndUp {
//hello
    public static String getLastThreeChars(String word) {
        if (word.length() < 3) return word.toUpperCase();

        String lastThreeChars = word.substring(word.length() - 3);
        String firstChars = word.substring(0, word.length() - 3);

        return firstChars + lastThreeChars.toUpperCase();



    }



}
