package org.juandavyc.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.models.TimeStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpaceStoneSingleton {
    private static volatile TimeStone spaceStone;
    public static TimeStone getInstance(){
        if (spaceStone == null){
            log.info("Creating first instance: "+SpaceStoneSingleton.class);
            synchronized (SpaceStoneSingleton.class){
                if (spaceStone == null){
                    return spaceStone = new TimeStone();
                }
            }
        }
        return spaceStone;
    }
}
