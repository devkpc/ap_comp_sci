package day9_apr25.laptop;

public class LaptopRunner {
    public static void main (String[] args)
    {
        Laptop comp = new Laptop("Dell", 15.6, 850.0);
        System.out.println("Brand: " + comp.getBrand());
        System.out.println("Size: " + comp.getScreenSize());
        System.out.println("cost: " + comp.getPrice());
    }
}
