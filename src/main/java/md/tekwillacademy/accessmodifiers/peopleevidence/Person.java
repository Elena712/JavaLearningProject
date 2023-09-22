package md.tekwillacademy.accessmodifiers.peopleevidence;

public class Person {
    //Private Instance variable because it defines the objects and Person class
    public long idnp;
    //Default instance variable
    String maritalStatus;
    //instance variable
    protected String name;
   //Public it is an instance variable
    public boolean isRetired;
    public Person(){
        System.out.println ("This is a defined constractor without params");
        }
    public Person(long idnp, String nameInput) {
        this.idnp = idnp;
        name = nameInput;
        System.out.println("This is defined constructor with 2 params");
    }

        public Person(long idnp, String name, String maritalStatus, boolean isRetired ){
        this.idnp = idnp;
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.isRetired = isRetired;

        System.out.println( "This is about the constructor nr.3 ");
    }

}

