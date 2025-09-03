public class FindMin {
    public static void main(String[] args) {
        int[] nums = { 23, 3, 4, 2, 5, 12 };
        System.out.println(min(nums));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

// Find the maximum element in the array

// public class FindMax {
// public static void main(String[] args) {
// int[] nums = { 23, 3, 4, 2, 5, 12 };
// System.out.println(max(nums));
// }

// static int max(int[] arr) {
// int ans = arr[0];
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > ans) {
// ans = arr[i];
// }
// }
// return ans;
// }
// }