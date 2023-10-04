package md.tekwillacademy.methodstask;

public class Customer {

    public String name;
    public String gen;
    public int age;

    public Customer(String name, String gen, int age) {
        this.name = name;
        this.gen = gen;

        if (age > 125 || age < 1) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public String setAge(int age){

        if (age > 125 || age < 1) {
            this.age = 0;
        } else {
            this.age = age;
        }


        public void setName (String name){
            this.name = name;

        }
        public int setAge( int Age){
            return this.age;
        }

        public String getName(){
            return this.name;
        }

        @Override
                public String toString (){
            return "Customer{" +
                    "name ='" + name + '\'' +
                    ", gen ='" + gen + '\'' +
                    ", age = '" + age +
                    '}';
        }
    }
}



