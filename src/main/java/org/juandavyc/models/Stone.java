package org.juandavyc.models;


import lombok.*;

import java.io.Serializable;

// @AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public abstract class Stone implements Serializable /*pueda clonar*/ {

    protected String color;
    protected String name;
    protected String location;
    protected Integer energyLevel;
    protected Integer numberOfSides;

    private static final int NUMBER_SIDES = 6;

    public Stone(String color, String name, String location, Integer energyLevel) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = NUMBER_SIDES;
    }

    public abstract void  usePower();

    public void clear(){
        System.out.println("clear");
    }

}
