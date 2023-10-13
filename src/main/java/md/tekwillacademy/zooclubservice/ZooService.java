package md.tekwillacademy.zooclubservice;

import jdk.internal.jimage.BasicImageReader;

public class ZooService {
    public static void main(String[] args) {
        Animal CharlyDog = new Dog("Charly", true);
        BasicImageReader charlyDog = null;
        System.out.println(charlyDog.getName());
        charlyDog.eat();
        charlyDog.makeSound();

        Animal rexDog = new Dog("Rex", false);
        System.out.println(rexDog.getName());
        Cat bonitaCat = new Cat("Bonita");
        bonitaCat.eat();
        bonitaCat.makeSound();
    }
    }