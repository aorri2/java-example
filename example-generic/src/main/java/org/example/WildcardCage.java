package org.example;

import java.util.List;
import java.util.stream.Stream;

public class WildcardCage {
    private final List<? extends Animal> cage;

    public WildcardCage(List<? extends Animal> animals) {
        this.cage = List.copyOf(animals);
    }

    public Stream<? extends Animal> getCageStream() {
        return cage.stream();
    }
}
