package org.example;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("냐옹냐옹");
    }

    public void jump() {
        System.out.println("폴짝");
    }

    @Override
    public String toString() {
        return "나는 고양이 입니다";
    }
}
