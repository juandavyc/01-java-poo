package org.juandavyc.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import org.juandavyc.models.MindStone;
import org.juandavyc.models.RealityStone;
import org.juandavyc.models.SpaceStone;
import org.juandavyc.models.Stone;
import org.juandavyc.singletons.RealityStoneSingleton;

//@Service
@Log
// @Setter
@AllArgsConstructor
@Getter
public class GauntletServiceImpl implements GauntletService {

    // No es inyeccion de dependencias
    // private final Stone reality = RealityStoneSingleton.getInstance();
    // private final Stone reality = new RealityStone(); // no singleton

    // via setter
//    private Stone mind;
//    private Stone space;

    // via constructor

    private final MindStone mind;
    private final SpaceStone space;

//    public GauntletServiceImpl(Stone mind, Stone space) {
//
//        this.mind = mind;
//        this.space = space;
//    }

    @Override
    public void useGauntlet(String stoneName) {

        switch (stoneName) {
            case "mind" -> log.info("useStone: " + this.mind);
            case "space" -> log.info("useStone: " + this.space);

            default -> throw new IllegalArgumentException("invalid name");
        }
        //log.info("useStone: "+ reality);
    }

    @Override
    public void useFullPower() {
        // faltan las otras xd
        if (this.space != null && this.mind != null) {
            log.info("USING 'ALL' POWER");
        } else {
            throw new IllegalStateException("Cant be use full power because this need all stones");
        }
    }
    // lombok ya hace el setter de mindStone
}