package org.example;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    public void bang() {
        System.out.println("끼잉");
    }

    @Override
    public String toString() {
        return "나는 개 입니다";
    }
}
