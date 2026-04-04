package day5_Feb21;

public class ArrayOne {

/*
*Given an array of ints, return true if the array is length 1 or more,
* and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*
*
* */
public static void main (String[] args) {
   int[] listOfNumbers = {};

   boolean result=sameFirstLast(listOfNumbers);

   System.out.println(result);

}




// access type +static+ return type+ method name
public static boolean sameFirstLast(int [] arr){

    if (arr.length<1) return false;

    if(arr[0]==arr[arr.length-1]) return true;

    return false;

}




}
