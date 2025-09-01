public class LinearSearch {
    public static void main(String[] args) {
        int num[] = { 20, 32, 34, 21, 45, 43 };
        int target = 21;
        int ans = Search(num, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index <= arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

            // To return the element
            // for (int element : arr) {
            // if (element == target) {
            // return element;

            // }
        }
        return -1;

    }
}

// Search the character in the String

// public class LinearSearch {
// public static void main(String[] args) {
// String name = "praveen";
// char target = 'e';
// System.out.println(Search(name, target));
// }

// static boolean Search(String str, char target) {
// if (str.length() == 0) {
// return true;
// }
// for (int i = 0; i <= str.length(); i++) {
// if (target == str.charAt(i));
// return true;
// }
// return false;
// }

// }

// linear search with start and end range

// public class LinearSearch {
// public static void main(String[] args) {
// int num[] = { 10, 2, 323, 43, 45, 65, 76 };
// int target = 10;
// System.out.println(search(num, target, 1, 6));
// }

// static int search(int[] arr, int target, int start, int end) {
// if (arr.length == 0) {
// return -1;
// }
// for (int i = start; i <=end; i++) {
// int element = arr[i];
// if (element == target) {
// return i;
// }
// }
// return -1;
// }
// }
