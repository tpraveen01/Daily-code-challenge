import java.lang.reflect.Array;
import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int nums[][] = {
                { 10, 23, 25 },
                { 34, 26, 54 },
                { 45, 12, 32 }
        };
        int target = 12;
        int[] ans = Search(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
