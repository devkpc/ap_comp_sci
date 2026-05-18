package day11_may18.inheritanceanimal;

public class RunnerInheritance {


    public static void main(String[] args) {
        Cat cat1= new Cat("tom",5);
        Dog dog1= new Dog("dog",7);

        cat1.eat();
        cat1.sleep();

        dog1.eat();
        dog1.sleep();
    }


}
