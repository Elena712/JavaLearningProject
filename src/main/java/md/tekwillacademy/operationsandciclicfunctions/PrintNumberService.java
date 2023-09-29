package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {

        int min = 3;
        int max = 1009;

        //printeaza numelere pare
        for (int i = min; i <= max; i ++) {
            if( i % 2 == 0){
                System.out.println(i);
            }

        }
        /* Numerele impare % 2 !=0 SAU numere % 2 == 1 */
        int i = min;
        while (i < max){
            if(i % 2 !=0){
                System.out.println(i);
            }

            i++;
            i += 1;
            i = i + 1;
        }


        int b = max;

        do {
            if(b % 2 ==1) {
                System.out.println(b);
            }
            b--;
        } while(b >=min);
    }



}
