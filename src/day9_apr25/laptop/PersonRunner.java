package day9_apr25.laptop;

public class PersonRunner {
    public static void main (String[] args) {
        Person person1 = new Person("John", 34);
        for (int i = 0; i < 3; i++) {
            person1.run();
        }
        person1.eat();
        person1.display();

    }
}
