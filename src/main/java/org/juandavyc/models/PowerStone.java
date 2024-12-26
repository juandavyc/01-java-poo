package org.juandavyc.models;

import lombok.ToString;

@ToString
public class PowerStone extends Stone {

    private static final String COLOR = "Red";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Power Stone LOCATION";
    private static final int ENERGY_LEVEL = 4;
    public PowerStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("userPower: PowerStone "+super.toString());

    }
}
