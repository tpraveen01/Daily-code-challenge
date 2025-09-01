// import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = { 10, 12, 20, 23, 24, 25 };
        int target = 24;
        // Scanner sc = new Scanner(System.in);
        // int target = 20;
        // // Ask for size of the array
        // System.out.print("Enter the number of elements: ");
        // int n = sc.nextInt();

        // // Create array
        // int[] arr = new int[n];

        // // Take input from user
        // System.out.println("Enter " + n + " elements:");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // // Print the array
        // System.out.print("Array entered by user: ");
        // for (int num : arr) {
        // System.out.print(num + " ");

        // }
        System.out.println(Bsearch(num, target));
    }

    static int Bsearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

// Binarysearch using Recursive

// public class BinarySearch {
// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 55, 66 };
// int target = 55;
// search(arr, target, 0, arr.length - 1);
// System.out.println(search(arr, target, 0, arr.length - 1));
// }

// static int search(int[] arr, int target, int s, int e) {
// if (s > e) {
// return -1;
// }
// int m = s + (e - s) / 2;
// if (arr[m] == target) {
// return m;
// }
// if (arr[m] < target) {
// return search(arr, target, s, m - 1);
// }
// return search(arr, target, m + 1, e);
// }
// }