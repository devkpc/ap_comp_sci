package day8_apr4;

public class MainDayEight {
        public static void main (String[] args) {
            Bicycle bike = new Bicycle("blue");
            bike.setSpeed(10);
            System.out.println("Color: " + bike.getColor());
            System.out.println("Speed: " + bike.getSpeed());
            System.out.println("Miles traveled: " + bike.travel((double)3/60)); // 3 minutes
            System.out.println("Location: " + bike.getLocation());
            bike.increaseSpeed(5);
            System.out.println("Speed: " + bike.getSpeed());
            System.out.println("Miles traveled: " + bike.travel((double)3/60)); // 3 minutes
            System.out.println("Location: " + bike.getLocation());




        }


}
