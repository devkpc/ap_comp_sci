package day4_Feb14;

import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        //in a loop till user enter quit
        while (true) {
            System.out.println("Enter a word to see if it's a palindrome >>> ");
            String word = console.nextLine();
            if (word.equalsIgnoreCase("quit"))
            {
                System.out.println("Thank you for playing!");
                break;
            }

            boolean isPalindrome = true;
            int rightIndex = word.length() - 1;
            int leftIndex = 0;

            while (leftIndex < rightIndex) {

                char leftLetter = word.charAt(leftIndex);
                char rightLetter = word.charAt(rightIndex);
                //check the chars are equal or not
                if (leftLetter != rightLetter) {
                    isPalindrome = false;
                    System.out.println("The word " + word + " is not a palindrome.");
                    break;
                }
                leftIndex++;
                rightIndex--;
            }
            if (isPalindrome) {
                System.out.println("The word " + word + " is a palindrome.");
            }
        }



    }


}
