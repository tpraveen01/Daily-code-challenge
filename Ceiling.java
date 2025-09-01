import java.util.Scanner;

public class Ceiling {
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
        return start;
    }
}

// public class Main{
// public static void main(String [] args){
// char [] letters={'c','f','g'};
// char target='c';
// int ans=search(letters,target);
// System.out.println((char)ans);
// }
// static int search(char [] letters,char target){
// int start=0;
// int end=letters.length-1;
// while(start<=end){
// int mid=start+(end-start)/2;
// if(target<letters[mid]){
// end=mid-1;
// }else{
// start=mid+1;
// }
// }
// return letters[start%letters.length];
// }
// }