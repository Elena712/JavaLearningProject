package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        System.out.println(b);

        a %= b;
        //a = a % b; a = 11 % 4; short form of divization with rest
        System.out.println(a);

        a += 4;
        System.out.println(a);


        int x = 15555;
        int sum = 0;
        for (int i = 0; i <= x; i++);{
            sum = sum +1;
        }

        System.out.println(sum);

        float c = 10;
        float d = 4;

        c /= d;
        System.out.println(d);
    }
}
