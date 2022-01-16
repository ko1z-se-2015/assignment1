package com.company.habitats;

import com.company.interfaces.Flyable;
import com.company.interfaces.Moveable;

public class Cell extends Habitat{
    Flyable flyable;

    public Cell(Moveable moveable, Flyable flyable) {
        super(moveable);
        this.flyable = flyable;
    }
}
