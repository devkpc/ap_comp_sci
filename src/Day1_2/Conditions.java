package Day1_2;

public class Conditions {

    public static void main(String[] args) {
//here

        //divideByFive(55);
        division(18);
    }


    //Write a method(function) using if to check a given number is divisible by five or not
    // input 67 output 67 is not divisible by 5
    // input 50 output 50 is divisible by 5
    public static void divideByFive(int num) {
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }
    }


    // write a function to check divisibility by 15

    public static void divideByFifteen(int num) {
        if (num % 15 == 0) {
            System.out.println(num + " is divisible by 15");
        } else {
            System.out.println(num + "is not divisible by 15");
        }
    }


    //write a function to check the number is divisible by 15, by 5 , by 3
    public static void division(int num) {
        if (num % 15 == 0) {
            System.out.println(num + " is divisible by 15");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5, not by 15");
        } else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3, not by 15");
        } else {

            System.out.println(num + " is not divisible by 5, 15, or 3");
        }



    }

























}