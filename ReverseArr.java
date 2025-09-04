import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 34, 3, 6, 5, 7 };
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
