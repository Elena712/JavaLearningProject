package md.tekwillacademy.methodstask;

public class ExecutionService {

    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,90));

        int randomInt = DataGeneratorUtil.getRandomInt(-50 );
        System.out.println(randomInt);

        System.out.print(DataGeneratorUtil.getRandomEmail("gmail.com"));
        {
            Customer customer1 = new Customer("Fat Frumos", "masculin", 43);
            String infoAboutCustomer1 = customer1.toString();

            System.out.println(infoAboutCustomer1);

            customer1.setAge(85232);
            System.out.println(infoAboutCustomer1);

            System.out.println("Fat Cosinzeana");
            System.out.println(customer1.toString());

            System.out.println( "Virsta lui Far este:" + customer1.getAge());
            System.out.println("Familia lui Fat este:" + customer1.getName());

            Customer customer2 = new Customer("Elena Cosanzeana", "feminin", 36);

        }
    }

}
