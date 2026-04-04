package day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordScramble {


    public static void main(String[] args) {

        Random rng = new Random();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a word here >>> ");
        String word = console.nextLine();

        //if the words length is less than or to 3 then just return the word itself
        if (word.length() <= 3)
        {
            System.out.println(word);
        }

        //Pick the first and last char of the word and put them in two differenet variables like firstChar and lastChar

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        if (lastChar == '!' || lastChar == '?' || lastChar == '.' || lastChar == ',')
        {

        }
        String middle = word.substring(1, word.length() - 1);
        char[] middleArray = middle.toCharArray();

//        System.out.println(middle);
//        System.out.println(firstChar);
//        System.out.println(lastChar);


        for (int i = 0; i < middleArray.length; i++)
        {
            int j = rng.nextInt(i+1);
            char temp = middleArray[i];
            middleArray[i] = middleArray[j];
            middleArray[j] = temp;

        }

        String scrambledWord = firstChar+ new String(middleArray)+lastChar;


      System.out.println(scrambledWord);









//
//        String newWord = "";
//
//
//
//
//
//
//        for (int i = 1; i <= middleArray.length - 2; i++)
//        {
//            int newPosition = rng.nextInt(1, middleArray.length - 2);
//            if (newPosition == i)
//            {
//                middleArray[i] = eachletter[i + 1];
//            }
//            System.out.println("The new scrambled word is " + newWord);
//
//
//
//
//    }

    }


}
