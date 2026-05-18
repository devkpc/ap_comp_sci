package day11_may18.inheritanceanimal;

public class Cat extends Animal {

    private String name;
    private int age;
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(name+" is meowing");
    }

}
