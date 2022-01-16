package com.company.abstract_classes;

import com.company.interfaces.Moveable;

abstract public class Animal implements Moveable {

    private final int size;

    public Animal(int size) {
        this.size = size;
    }

    @Override
    public int getComfortableSpace() {
       return size;
    }
}
