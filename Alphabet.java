
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not Alphabet");
        }
    }
}
