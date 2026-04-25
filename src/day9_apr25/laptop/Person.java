package day9_apr25.laptop;

public class Person {
    private String name;
    private int age;
    private int energy;
    public Person(String n, int a)
    {
        name = n;
        age = a;
        energy = 100;

    }
    public void run()
    {
        energy -= 10;
        System.out.println("You have ran, and so you lost 10 cals of energy");
    }
    public void eat()
    {
        energy += 20;
        System.out.println("You have just ate and gained 20 cals of energy");
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Energy " + energy);
    }
}
