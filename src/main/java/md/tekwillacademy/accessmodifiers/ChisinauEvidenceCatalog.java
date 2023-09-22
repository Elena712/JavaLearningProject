package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.Main;
import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person Cristina = new Person();
        System.out.println(Cristina.isRetired);
        Cristina.isRetired = true;

        if(Cristina.isRetired) {
            System.out.println("Cristina is retired and is enjoying this time");

        } else {
                System.out.println(" Cristina is not yet retired and have still to work");
            }
        Person gheorghe = new Person(12345312L, "gheorghe", "Merried", true);

        System.out.println("info about gheorghe: " + gheorghe.isRetired);

        if(gheorghe.isRetired) {
            System.out.println("gheorghe is retired and is enjoying this time");

        } else {
            System.out.println(" gheorghe is not yet retired and have to work");
        }

        Person marcel= new Person( 123232342L, "marcel");

        System.out.println( "Available info about marcel:" + marcel.isRetired);

        if(marcel.isRetired) {
            System.out.println("marcel is retired and is enjoying this time");

        } else {
            System.out.println("marcel is not yet retired and have to work");
        }


        }
    }

