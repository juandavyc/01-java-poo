package org.juandavyc.factories;

import org.juandavyc.models.MindStone;
import org.juandavyc.models.Stone;
import org.juandavyc.prototypes.Prototypes;
import org.juandavyc.singletons.MindStoneSingleton;

public class MindFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {
        if(super.isSingleton()){
            return MindStoneSingleton.getInstance();
        }
        else{
            return Prototypes.mindPrototype.buildPrototype(new MindStone());
        }
    }
}
