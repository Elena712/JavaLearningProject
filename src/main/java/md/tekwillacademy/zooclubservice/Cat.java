package md.tekwillacademy.zooclubservice;

public class Cat extends Animal implements Animalinterface{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meouw");
    }

    @Override
    public void eat() {
        System.out.println("A cat is eating fish");
    }
}
