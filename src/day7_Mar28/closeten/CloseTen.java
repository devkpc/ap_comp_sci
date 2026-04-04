package day7_Mar28.closeten;

public class CloseTen {



    public static int closeTen(int alpha , int beta) {

        int distanceOfAlphaToTen = Math.abs(10-alpha);
        int distBeta = Math.abs(10-beta);

        if (distanceOfAlphaToTen > distBeta) return distBeta;
        if (distanceOfAlphaToTen < distBeta) return distanceOfAlphaToTen;

        return 0;


//        if (Math.abs(10 - alpha) < Math.abs(10 - beta))
//        {
//            return alpha;
//        } else if (Math.abs(10 - beta) < Math.abs(10 - alpha)) {
//            return beta;
//        }
//            return 0;


    }


}
