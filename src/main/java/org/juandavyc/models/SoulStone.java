package org.juandavyc.models;

import lombok.ToString;

@ToString
public class SoulStone extends Stone {

    private static final String COLOR = "Orange";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Soul Stone LOCATION";
    private static final int ENERGY_LEVEL = 8;
    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {

        System.out.println("userPower: SoulStone "+super.toString());
    }
}
