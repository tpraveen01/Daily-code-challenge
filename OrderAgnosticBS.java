import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] agrs) {
        int[] num = { 78, 76, 45, 33, 32, 30, 4, 2, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        System.out.println(Bsearch(num, target));

    }

    static int Bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAse = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAse) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
