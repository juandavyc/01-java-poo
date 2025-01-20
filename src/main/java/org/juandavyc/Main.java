package org.juandavyc;

import org.juandavyc.configs.StoneContext;
import org.juandavyc.factories.MindFactory;
import org.juandavyc.factories.SpaceFactory;
import org.juandavyc.models.*;
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
//        System.setProperty("scope","singleton"); //("scope","prototype");
//
//        final var mindStoneFactory = new MindFactory();
//        var mindStone = mindStoneFactory.createStone();
//
//        final var spacetoneFactory = new SpaceFactory();
//        var spaceStone = spacetoneFactory.createStone();
//
//        System.out.println(mindStone);
//        System.out.println(spaceStone);

//        MindStone mindFactory = (MindStone) new MindFactory().createStone();
//        SpaceStone spaceFactory = (SpaceStone) new SpaceFactory().createStone();
//
////      // via constructor
//        final var gauntletService = new GauntletServiceImpl(
//                mindFactory,
//                spaceFactory
//        );
//
//
////        // inyeccion via setter
////        gauntletService.setMind(mindFactory.createStone());
////        gauntletService.setSpace(spaceFactory.createStone());
////
//       gauntletService.useGauntlet("mind");
////        gauntletService.useGauntlet("space");
////
//       gauntletService.useFullPower();


        final var gauntletService = StoneContext.setContext(
                pre -> System.out.println("Do something 1"),
                pre -> System.out.println("Do something 2")
        );

        gauntletService.useGauntlet("mind");

        gauntletService.useFullPower();

        StoneContext.destroyContext(gauntletService);
    }
}