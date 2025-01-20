package org.juandavyc;

import org.juandavyc.factories.MindFactory;
import org.juandavyc.factories.SpaceFactory;
import org.juandavyc.models.MindStone;
import org.juandavyc.models.PowerStone;
import org.juandavyc.models.RealityStone;
import org.juandavyc.models.Stone;
import org.juandavyc.prototypes.Prototypes;
import org.juandavyc.services.GauntletService;
import org.juandavyc.services.GauntletServiceImpl;
import org.juandavyc.singletons.MindStoneSingleton;
import org.juandavyc.singletons.RealityStoneSingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        final var mind = new MindFactory(); // OK
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

//        var r1 = RealityStoneSingleton.getInstance();
//        var r2 = RealityStoneSingleton.getInstance();
//        var r3 = RealityStoneSingleton.getInstance();
//
//        if (r1 == r2 && r2 == r3) {
//            System.out.println("same, is singleton");
//        }

//        // instance 1
//        final var mind = new MindStone();
//
//        System.out.println(mind);
//        System.out.println(System.identityHashCode(mind));
//
//        // instance 2
//        final var mindProto = Prototypes.mindPrototype.buildPrototype(mind);
//        System.out.println(mindProto);
//        System.out.println(System.identityHashCode(mindProto));
//
//        // instance 3
//        final var mindProto2 = Prototypes.mindPrototype.buildPrototype(mind);
//        System.out.println(mindProto2);
//        System.out.println(System.identityHashCode(mindProto2));
//

        System.setProperty("scope","singleton"); //("scope","prototype");

        final var mindStoneFactory = new MindFactory();
        var mindStone = mindStoneFactory.createStone();

        final var spacetoneFactory = new SpaceFactory();
        var spaceStone = spacetoneFactory.createStone();

        System.out.println(mindStone);
        System.out.println(spaceStone);

    }
}