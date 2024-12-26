package org.juandavyc.services;

import lombok.extern.java.Log;
import org.juandavyc.models.RealityStone;
import org.juandavyc.models.Stone;

//@Service
@Log

public class GauntletServiceImpl implements GauntletService {

    private final Stone reality = new RealityStone();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("useStone: "+ reality);
    }

}
