package org.juandavyc.singletons;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.models.RealityStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {
    private static volatile RealityStone realityStone;
    public static RealityStone getInstance(){
        if (realityStone == null){
            log.info("Creating first instance: "+RealityStoneSingleton.class);
            synchronized (RealityStoneSingleton.class){
                if (realityStone == null){
                    return realityStone = new RealityStone();
                }
            }
        }
        return realityStone;
    }

}
