package day10_may2.ternary;

public class TernaryTwo {

    public static void main(String[] args) {

    int score = 10;
    String result = score >= 60 ? "Pass" : "Fail";
    System.out.println(result);

    int x = 100;
    int y = 90;
    int maximum = x > y ? x : y;
    System.out.println(maximum);



    double testScore = 54.9;
//    char grade = testScore >= 90 ? 'A' : testScore >= 80 && testScore < 90 'B' : testScore >= 70 && testScore < 80 'C' ; testScore >= 60 && testScore < 70 'D' : testScore >= 50 && testScore < 60 'F';

        char grade = testScore >= 90 ? 'A'
                : testScore>=80 ? 'B'
                : testScore>=70 ? 'C'
                : testScore>=60 ? 'D'
                :'F';

        System.out.println(grade);
    }
}
