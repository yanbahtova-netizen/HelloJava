package javaCore4;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}

class Raspackovka {
    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            int size = ois.readInt();
            Animal[] animals = new Animal[size];
            for (int i = 0; i < size; i++) {
                Animal animal = (Animal) ois.readObject();
                animals[i] = animal;
            }
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}