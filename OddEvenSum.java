import java.util.*;

public class OddEvenSum {
    public static int OddEvenSum(int n) {
        int evensum = 0;
        int oddsum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
            n /= 10;
        }
        return Math.max(evensum, oddsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(OddEvenSum(n));
    }
}