import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter the number to Reverse:");
        int n = in.nextInt();
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }

}
