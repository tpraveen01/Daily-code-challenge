
import java.util.Scanner;

public class AsciValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int asci = (int) ch;
        System.out.println(asci);
    }
}