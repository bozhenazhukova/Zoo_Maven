package model;

public class Stingray extends Animal {
    @Override
    public void breathe() {
        System.out.print(name + " can breathe water.");

    }

    @Override
    public void move() {
        System.out.print(name + " can swim.");

    }
    @Override
    public void uniqueAction() {
        System.out.println(name + " is electric.");


    }
}
