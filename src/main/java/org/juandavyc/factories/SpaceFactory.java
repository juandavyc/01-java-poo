package org.juandavyc.factories;

import org.juandavyc.models.SpaceStone;
import org.juandavyc.models.Stone;
import org.juandavyc.prototypes.Prototypes;
import org.juandavyc.singletons.SpaceStoneSingleton;

public class SpaceFactory extends ConfigurableStoneFactory{

    @Override
    public Stone createStone() {
        if(super.isSingleton()){
            return SpaceStoneSingleton.getInstance();
        }
        else{
            return Prototypes.spaceStone.buildPrototype(new SpaceStone());
        }

    }
}
