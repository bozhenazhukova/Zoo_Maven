package model;

public class Monkey extends Animal {
    @Override
    public void breathe() {
        System.out.print(name + " can breathe air.");
    }

    @Override
        public void move () {
        System.out.print(name + " can run.");

    }
        @Override
        public void uniqueAction () {
            System.out.println(name + " can climb.");

        }
    }


