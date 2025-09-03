import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation (add, subtract, multiply,division):");
        String choice = in.nextLine();
        System.out.println("Enter num1 and num2:");
        int num1 = in.nextInt(); // Reading num1
        int num2 = in.nextInt(); // Reading num2

        switch (choice) {
            case "add":
                int a = num1 + num2;
                System.out.println(a);
                break;
            case "subtract":
                int b = num1 - num2;
                System.out.println(b);
                break;
            case "multiply":
                int c = num1 * num2;
                System.out.println(c);
                break;
            case "division":
                int d = num1 / num2;
                System.out.println(d);
                break;
            default:
                System.out.println("Wrong Choice");
        }

    }
}
