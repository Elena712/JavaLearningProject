package md.tekwillacademy.methodstask;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random objectOfRandomClass = new Random();

    public static int getRandomInt(int min, int max) {
        int delta = max - min;
        if (delta <= 0) {
            System.out.println("The delta has to be positive");
            return 0;

        }

        int randomIntForThisDelta = objectOfRandomClass.nextInt(delta);
        return randomIntForThisDelta + min;
    }

    public static int getRandomInt(int limit) {

        if (limit<0){
            return 3;
        }
        return objectOfRandomClass.nextInt(limit);
    }

    protected static String getRandomEmail(String domainName){
        String uniqueUUID = UUID.randomUUID().toString();
        return uniqueUUID + "@" + domainName;


    }
}
