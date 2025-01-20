package org.juandavyc.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.juandavyc.models.SoulStone;
import lombok.extern.java.Log;


@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SoulStoneSingleton {
    private static volatile SoulStone soulStone;
    public static SoulStone getInstance(){
        if (soulStone == null){
            log.info("Creating first instance: "+SoulStoneSingleton.class);
            synchronized (SoulStoneSingleton.class){
                if (soulStone == null){
                    return soulStone = new SoulStone();
                }
            }
        }
        return soulStone;
    }
}
