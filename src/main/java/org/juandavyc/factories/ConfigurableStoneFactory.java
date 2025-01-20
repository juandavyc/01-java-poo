package org.juandavyc.factories;

import lombok.extern.java.Log;
import org.juandavyc.models.Stone;

import java.util.Optional;

@Log
public abstract class ConfigurableStoneFactory {
    // si quiere singleton o prototypes

    public abstract Stone createStone();
    protected boolean isSingleton(){

        final var scopeOpt = Optional.of( System.getProperty("scope"));
        final var scope = scopeOpt.orElse("singleton");
        log.info("scope: "+scope);
        return scope.equals("singleton") ? true: false;

    }

}
