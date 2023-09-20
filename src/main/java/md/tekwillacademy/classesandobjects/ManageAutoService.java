package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ManageAutoService {

    public static void main(String[] args) {
        Garage autoDocGarage;

        autoDocGarage = new Garage();
        autoDocGarage.address =("Stefan cel Mare, Ibuh 64");
        autoDocGarage.surfaceM2 = 450.0f;


         System.out.println( "Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address
     + "    " + autoDocGarage.surfaceM2 + "    " + autoDocGarage.capacity);
         autoDocGarage.capacity = 10;
         System.out.println( "Obiectul autoDocGarage are urmatoarele proprietati" + autoDocGarage.address
                + "    " + autoDocGarage.surfaceM2 + "    " + autoDocGarage.capacity);

         Garage garajIaloveni = new Garage();


        System.out.println( "Obiectul garajIaloveni are urmatoarele proprietati" + garajIaloveni.address
                + "    " + garajIaloveni.surfaceM2 + "    " +  garajIaloveni.capacity);

        Worker Vasile = new Worker();

        Vasile.name = "Vasile";
        Vasile.age = 54;

        System.out.println("Obiectul nostru are numele de "  +  Vasile.name + " si are varsta de " + Vasile.age + " ani.");

        Worker ion = new Worker();

        System.out.println("Obiectul nostru are numele de "  +  ion.name + " si are varsta de " + ion.age + " ani.");

        Person client1 = new Person( "37360975264");

        Car skodaBHE321 = new Car( "HANUKKAHS23232SDS", "Skoda Superb", client1);

        System.out.println( "Obiectul nostru are numele de " + skodaBHE321.mark +"     "+

        "si proprietarul poate fi apelat la " + skodaBHE321.owner.phoneNumber);











    }

}
