package model;

import interfaces.Breathe;
import interfaces.Move;
import interfaces.UniqueProperty;


public abstract class Animal implements Breathe, Move, UniqueProperty {

        String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
