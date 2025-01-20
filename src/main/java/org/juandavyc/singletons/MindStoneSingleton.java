package org.juandavyc.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.models.MindStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class MindStoneSingleton {
    // patron de diseño Thread safe, singleton
    // volatile (garantiza que es visible en todos los hilos).
    private static volatile MindStone mindStoneInstance;

    public static MindStone getInstance(){

        if (mindStoneInstance == null){
            log.info("Creating first instance: "+MindStoneSingleton.class);
            // x si llegan dos hilos
            synchronized (MindStoneSingleton.class){
                if (mindStoneInstance == null){
                    mindStoneInstance = new MindStone();
                }
            }
        }
        return mindStoneInstance;
    }


// NoArgsConstructor(access = AccessLevel.PRIVATE)
//    private MindStoneSingleton() {
//
//    }
}
