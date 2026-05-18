package day11_may18.inheritanceanimal;

public class Dog extends Animal {

    private String name;
    private int age;

    public Dog(String name, int age) {
        super(name, age);
    }



    public void bark() {
        System.out.println(name+" is barking");
    }

}
