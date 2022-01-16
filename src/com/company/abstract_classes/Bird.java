package com.company.abstract_classes;

import com.company.interfaces.Flyable;

abstract public class Bird extends Animal implements Flyable {
    public Bird(int size) {
        super(size);
    }
}
