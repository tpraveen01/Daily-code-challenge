import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 6, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the target number:");
        int target = sc.nextInt();
        System.out.println(Bsearch(nums, target));
    }

    static int Bsearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
