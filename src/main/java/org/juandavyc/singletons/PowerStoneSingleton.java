package org.juandavyc.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.models.PowerStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PowerStoneSingleton {
    private static volatile PowerStone powerStone;

    public static PowerStone getInstance() {
        log.info("Creating first instance: " + PowerStoneSingleton.class);
        if (powerStone == null) {
            synchronized (PowerStoneSingleton.class) {
                if (powerStone == null) {
                    return powerStone = new PowerStone();
                }
            }
        }
        return powerStone;
    }
}
