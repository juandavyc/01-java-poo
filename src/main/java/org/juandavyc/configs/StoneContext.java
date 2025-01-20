package org.juandavyc.configs;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.juandavyc.factories.MindFactory;
import org.juandavyc.factories.SpaceFactory;
import org.juandavyc.models.MindStone;
import org.juandavyc.models.SpaceStone;
import org.juandavyc.services.GauntletService;
import org.juandavyc.services.GauntletServiceImpl;

import java.util.function.Consumer;
@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
// IoC inversion del control
public class StoneContext {

    public static GauntletService setContext(
            Consumer<Void> preContruct,
            Consumer<Void> postContruct
    ){
        log.info("IoC set Scope");
        System.setProperty("scope","singleton"); //("scope","prototype");

        // @preContruct
        log.info("IoC executing PreContruct");
        preContruct.accept(null);

        log.info("IoC creating factories");

        MindStone mindFactory = (MindStone) new MindFactory().createStone();
        SpaceStone spaceFactory = (SpaceStone) new SpaceFactory().createStone();

        log.info("IoC loading GauntletServiceImpl in Container ");
//      // via constructor
        final var gauntletService = new GauntletServiceImpl(
                mindFactory,
                spaceFactory
        );


//        // inyeccion via setter
//        gauntletService.setMind(mindFactory.createStone());
//        gauntletService.setSpace(spaceFactory.createStone());
//

//        gauntletService.useGauntlet("space");

        //@PostContruct

        log.info("IoC executing PreContruct");
        postContruct.accept(null);

        return gauntletService;
    }

    public static void destroyContext(GauntletService gauntletService){
        log.info("Cleaing context");
        if(gauntletService instanceof GauntletServiceImpl ){
            ((GauntletServiceImpl) gauntletService).getMind().clear();
            ((GauntletServiceImpl) gauntletService).getSpace().clear();
        }
        log.info("Cleaing properties");
        System.clearProperty("scope");
    }

}
