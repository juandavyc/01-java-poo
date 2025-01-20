package org.juandavyc.prototypes;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.juandavyc.models.MindStone;
import org.juandavyc.models.SpaceStone;
import org.juandavyc.models.TimeStone;

@AllArgsConstructor(access = AccessLevel.PRIVATE)

/*
cualquier clase que tenga metodos staticos
unicamente debe tener un constructor privado
 */
public class Prototypes {

    public static StonePrototype<MindStone> mindPrototype =
            stone-> stone.getPrototype();

    public static StonePrototype<SpaceStone> spaceStone =
            stone-> stone.getPrototype();

    public static StonePrototype<TimeStone> timeStone =
            stone-> stone.getPrototype();



}
