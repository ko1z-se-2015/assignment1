package com.company.habitats;

import com.company.abstract_classes.Animal;
import com.company.interfaces.Flyable;
import com.company.interfaces.Moveable;

import java.util.ArrayList;

public class Cell extends Habitat{
    private Flyable flyable;
    private int size;

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    public Cell(Moveable moveable, Flyable flyable) {
        super(moveable);
        this.flyable = flyable;
    }
}
