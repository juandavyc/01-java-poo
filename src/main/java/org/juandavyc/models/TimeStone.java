package org.juandavyc.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true)
@Log
public class TimeStone extends Stone {

    private static final String COLOR = "Green";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "Time Stone LOCATION";
    private static final int ENERGY_LEVEL = 4;
    public TimeStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {

        System.out.println("userPower: timeStone "+super.toString());
    }

    public TimeStone getPrototype() {
        // mediante serializacion
        try (
                final var bos = new ByteArrayOutputStream();
                final var oos = new ObjectOutputStream(bos);
        ) {
            // convertir objeto en bytes

            // serialize
            oos.writeObject(this);
            oos.flush();
            try (
                    final var bis = new ByteArrayInputStream(bos.toByteArray());
                    final var ois = new ObjectInputStream(bis);
            ) {
                return (TimeStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class");
            throw new RuntimeException(e.getMessage());
        }
    }
}
