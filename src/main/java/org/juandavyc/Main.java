package org.juandavyc;

import org.juandavyc.models.MindStone;
import org.juandavyc.models.PowerStone;
import org.juandavyc.models.RealityStone;
import org.juandavyc.models.Stone;
import org.juandavyc.services.GauntletService;
import org.juandavyc.services.GauntletServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        final var mind = new MindStone(); // OK
//        final Stone power = new PowerStone(); // OK
//        final Stone reality = new RealityStone(); // KO
//
//        mind.usePower();
//        System.out.println("----");
//        power.usePower();
//        System.out.println("----");
//        reality.usePower();

        final var gauntletService = new GauntletServiceImpl();
        //gauntletService.reality = null;
        gauntletService.useGauntlet("");

    }
}