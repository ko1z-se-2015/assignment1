package com.company.abstract_classes;

import com.company.interfaces.Swimable;

abstract public class Fish extends Animal implements Swimable {
    public Fish(int size) {
        super(size);
    }
}
