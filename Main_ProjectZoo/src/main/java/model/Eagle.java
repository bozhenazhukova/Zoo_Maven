package model;

public class Eagle extends Animal {
    @Override
    public void breathe() {
        System.out.print(name + " can breathe air.");

    }
    @Override
    public void move() {
        System.out.print(name + " can fly.");

    }
    @Override
    public void uniqueAction() {
        System.out.println(name + " can hunt.");


    }
}
