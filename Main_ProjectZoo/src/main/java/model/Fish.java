package model;

public class Fish extends Animal {

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
        System.out.println(name + " can hunt fish.");


    }
}
