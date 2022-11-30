package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------typeParameter example----------------");
        typeParameterExample();
        System.out.println("--------------wildcard example----------------");
        wildcardExample();

        needsWildcardExample();
    }

    public static void typeParameterExample() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        TypeParameterCage<Dog> dogCage = new TypeParameterCage<>(Arrays.asList(dog1, dog2, dog3, dog4));
        TypeParameterCage<Cat> catCage = new TypeParameterCage<>(Arrays.asList(cat1, cat2, cat3, cat4));
        TypeParameterCage<Animal> combinedCage = new TypeParameterCage<>(Arrays.asList(cat1, cat2, cat3, cat4, dog1, dog2, dog3, dog4));

        dogCage.getCageStream().forEach(Dog::bang);
        catCage.getCageStream().forEach(Cat::jump);
        combinedCage.getCageStream().forEach(Animal::makeSound);
    }

    public static void wildcardExample() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        WildcardCage dogCage = new WildcardCage(Arrays.asList(dog1, dog2, dog3, dog4));
        WildcardCage catCage = new WildcardCage(Arrays.asList(cat1, cat2, cat3, cat4));
        WildcardCage combinedCage = new WildcardCage(Arrays.asList(cat1, cat2, cat3, cat4, dog1, dog2, dog3, dog4));

//        dogCage.getCageStream().forEach(Dog::bang); error
//        catCage.getCageStream().forEach(Cat::jump); error
        dogCage.getCageStream().forEach(dog -> dog.makeSound());
        catCage.getCageStream().forEach(cat -> cat.makeSound());
        combinedCage.getCageStream().forEach(Animal::makeSound);

    }

    private static void needsWildcardExample() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4);
        List<Dog> dogList = Arrays.asList(dog1, dog2, dog3, dog4);
        List<Animal> animalList = Arrays.asList(cat1, cat2, cat3, cat4, dog1, dog2, dog3, dog4);

        MyList<Animal> allAnimalList = new MyListImpl<>();
//        allAnimalList.addAll(catList);
//        allAnimalList.addAll(dogList);
        allAnimalList.addAll(animalList);


        List<Animal> javaList = new ArrayList<>();
        javaList.addAll(dogList);
        javaList.addAll(catList);
        javaList.addAll(animalList);
    }
}