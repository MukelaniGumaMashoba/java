
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

        k.close();
    }
}
