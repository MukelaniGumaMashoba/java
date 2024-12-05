
import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {

        // consolling hellow world
        System.out.println("hellow world");

        // taking input from user using scanner
        Scanner k = new Scanner(System.in);
        // cosnoles the user to enter his name
        System.out.println("Enter your name: ");
        // takes the input from user
        String name = k.nextLine();

        // consoling the user with his name
        System.out.println("Hello " + name);

        // explicit type casting
        byte b = 127;
        int a = 10;
        b = (byte) a;
        System.out.println(b);

        // type promotion so if the byte is bigger will be promoted to int and then multiplied
        byte z = 80;
        int x = 30;

        // arithmetic operation + - / * %
        int result = z * x;
        System.out.println("This is the number " + result);

        // logical operators
        boolean isAdult = true;
        boolean isStudent = false;

        // logical AND
        if (isAdult && isStudent) {
            System.out.println("You are an adult and a student");
        } else {
            System.out.println("You are not an adult and a student");
        }

        int muke = 5;
        int muke2 = 10;

        if (muke > muke2) {
            System.out.println("muke is greater than muke2");
        } else {
            System.out.println("muke is less than muke2");
        }
        // using ternary operator to find the maximum of two numbers
        int max = (muke > muke2) ? muke : muke2;
        System.out.println("The maximum of muke and muke2 is: " + max);

        // switch case
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        k.close();
    }
}
