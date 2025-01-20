package org.juandavyc.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString(callSuper = true) // llamar propiedades del padre
@Log
public class MindStone extends Stone {

    private static final String COLOR = "Red";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Mind Stone LOCATION";
    private static final int ENERGY_LEVEL = 6;

    public MindStone() {

        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("userPower: MindFactory " + super.toString());
    }

    public MindStone getPrototype() {
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
                return (MindStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class");
            throw new RuntimeException(e.getMessage());
        }
    }
}
