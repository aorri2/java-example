package org.example;

import java.util.List;
import java.util.stream.Stream;

public class TypeParameterCage<T extends Animal> {
    private final List<T> cage;

    public TypeParameterCage(List<T> animals) {
        this.cage = List.copyOf(animals);
    }

    public Stream<T> getCageStream() {
        return cage.stream();
    }
}
