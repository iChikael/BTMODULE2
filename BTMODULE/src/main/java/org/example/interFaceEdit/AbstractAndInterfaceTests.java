package org.example.interFaceEdit;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        animals[] animals = new animals[2];
        animals[0] = new animals() {
            @Override
            public String makeSound() {
                return null;
            }
        };
        animals[1] = new Chicken();
        for (animals animal : animals) {
            animal.makeSound();
        }
    }
}