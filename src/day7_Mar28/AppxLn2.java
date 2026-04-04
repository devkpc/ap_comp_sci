package day7_Mar28;

public class AppxLn2 {

    public static void main(String[] args) {

        System.out.println(appxLn2(100000));
    }



    public static double appxLn2(int a) {

        double sum = 0;

        for (int i = 0; i < a; i++)
        {
            if (i % 2 != 0) {
                sum-=1.0/(i+1);
            }
            else {
                sum+=1.0/(i+1);
            }

        }


        return sum;
    }

}
