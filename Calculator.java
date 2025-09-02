import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the Operater:");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter the num1 and num2:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
            } else if (ch == 'x' || ch == 'X') {
                System.out.println(" enter valid oparater ");
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }
}
