import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        String axole = "";

        System.out.println(axole);

        switch (axole) {
            case "Axole" -> System.out.println(axole);
            default -> throw new AssertionError();
        }

    }
}
