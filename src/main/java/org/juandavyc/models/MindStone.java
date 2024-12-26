package org.juandavyc.models;

import lombok.ToString;

@ToString
public class MindStone extends Stone {

    private static final String COLOR = "Red";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Mind Stone LOCATION";
    private static final int ENERGY_LEVEL = 6;
    public MindStone() {

        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("userPower: MindStone "+super.toString());

    }
}
