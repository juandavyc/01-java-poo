package org.juandavyc.prototypes;

import org.juandavyc.models.Stone;

@FunctionalInterface
public interface StonePrototype<S extends Stone> {
    // <S> programacion generica, any object <extends stone>, solo adminta stone

    // metodo abstracto
    S buildPrototype(S stone);



}
