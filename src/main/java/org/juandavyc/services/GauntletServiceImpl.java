package org.juandavyc.services;

import lombok.extern.java.Log;
import org.juandavyc.models.RealityStone;
import org.juandavyc.models.Stone;
import org.juandavyc.singletons.RealityStoneSingleton;

//@Service
@Log

public class GauntletServiceImpl implements GauntletService {


    private final Stone reality = RealityStoneSingleton.getInstance();
    // private final Stone reality = new RealityStone(); // no singleton
    @Override
    public void useGauntlet(String stoneName) {

        log.info("useStone: "+ reality);
    }

}
