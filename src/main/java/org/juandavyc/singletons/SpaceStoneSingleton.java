package org.juandavyc.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.models.SpaceStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceStoneSingleton {
    private static volatile SpaceStone spaceStone;
    public static SpaceStone getInstance(){
        if (spaceStone == null){
            log.info("Creating first instance: "+SpaceStoneSingleton.class);
            synchronized (SpaceStoneSingleton.class){
                if (spaceStone == null){
                    return spaceStone = new SpaceStone();
                }
            }
        }
        return spaceStone;
    }
}
