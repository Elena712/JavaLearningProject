package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {

        String nameOfTheDay ="FRidaY";

        int numberOfTheDay;
        System.out.println(nameOfTheDay.toUpperCase());

        switch (nameOfTheDay){
            case "Monday":
                numberOfTheDay = 1;
                System.out.println("A case has been found");
                break;
                case "Tuesday":
                numberOfTheDay = 2;
                System.out.println("2end has been found");
                break;
            case "Wednesday":
                numberOfTheDay = 3;
                System.out.println("A 3th case has been found");
                break;
            case "Thusday":
                numberOfTheDay = 4;
                System.out.println("4th case has been found");
                break;
            case "Friday":
                numberOfTheDay = 5;
                System.out.println("5th case has been found");
                break;
            case "Saturday":
                numberOfTheDay = 6;
                System.out.println("6th case has been found");
                break;
            case "Sunday":
                numberOfTheDay = 9;
                System.out.println("7th case has been found");

            default:
                numberOfTheDay = 5;
                System.out.println("Here is your day");
        }

        System.out.println(numberOfTheDay);


    }
}
