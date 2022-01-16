package com.company.habitats;

import com.company.interfaces.Moveable;
import com.company.interfaces.Swimable;

public class Aquarium extends Habitat {
    Swimable swimable;

    public Aquarium(Moveable moveable, Swimable swimable) {
        super(moveable);
        this.swimable = swimable;
    }
}
