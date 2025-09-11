import java.util.Scanner;
import java.util.Arrays;

public class HAscHdsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = n / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        swap(arr, mid, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second) {
        while (first < second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
            first++;
            second--;
        }
    }
}