package day6_march7;

public class ApproximatePi {


    public static void main(String[] args) {


        System.out.println(approximatePi(100));
    }


    public static double approximatePi(int iterations) {
        double sum = 0.0;
        double sign = 1.0;     // starts positive
        double denominator = 1.0;

        for (int i = 0; i < iterations; i++) {
            sum += sign * (1.0 / denominator);

            sign = -sign;          // flip sign (+ to -, - to +)
            denominator += 2;      // move to next odd number
        }

        return 4 * sum;
    }


}
