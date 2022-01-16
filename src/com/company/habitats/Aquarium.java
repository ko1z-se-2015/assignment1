package com.company.habitats;

import com.company.abstract_classes.Animal;
import com.company.interfaces.Moveable;
import com.company.interfaces.Swimable;

import java.util.ArrayList;

public class Aquarium extends Habitat {
    private Swimable swimable;

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

    public Aquarium(Moveable moveable, Swimable swimable) {
        super(moveable);
        this.swimable = swimable;
    }

    public void add(){

    }
}
