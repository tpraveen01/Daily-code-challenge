import java.util.Scanner;
import java.util.Arrays;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counteven = 0;
        int countodd = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }
        }
        System.out.println(counteven);
        System.out.println(countodd);
    }
}