package org.juandavyc.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.models.TimeStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TimeStoneSingleton {

    private static volatile TimeStone timeStone;
    public static TimeStone getInstance(){
        if (timeStone == null){
            log.info("Creating first instance: "+TimeStoneSingleton.class);
            synchronized (TimeStoneSingleton.class){
                if (timeStone == null){
                    return timeStone = new TimeStone();
                }
            }
        }
        return timeStone;
    }
}
