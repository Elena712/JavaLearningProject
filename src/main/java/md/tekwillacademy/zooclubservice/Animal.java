package md.tekwillacademy.zooclubservice;

public abstract class Animal implements Animalinterface {
    private String name;

    public Animal(String nameValue) {
        this.name = nameValue;
    }
        public String getName(){
            return this.name;
        }

    public abstract void eat();
}
