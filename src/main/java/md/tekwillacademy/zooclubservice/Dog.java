package md.tekwillacademy.zooclubservice;

public class Dog extends Animal implements Animalinterface{
    private boolean hasAGoodLife;
    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrr, Hrrr");
    }

    @Override
    public void eat(){
        System.out.println("The dog is eating eggs");
    }

    public String getName(){
        return this.name + "this is from child class";
    }
}
