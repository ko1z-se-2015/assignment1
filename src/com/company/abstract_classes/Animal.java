package com.company.abstract_classes;

import com.company.interfaces.Moveable;

abstract public class Animal implements Moveable {
    @Override
    public int getComfortableSpace() {
       return 10;
    }
}
