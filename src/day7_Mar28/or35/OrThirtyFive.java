package day7_Mar28.or35;

public class OrThirtyFive {
    public static boolean divisibleByThreeOrFive(int n) {
        if (n % 3 == 0) return true;
        if (n % 5 == 0) return true;
        return false;

    }
}
