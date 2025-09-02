import java.util.Scanner;
// 1.EVEN OR ODD NUMBER
// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// // isodd(n);
// System.out.println(isodd(n));
// }

// static boolean isodd(int n) {
// if (n == 0) {
// return false;
// }
// return (n & 1) == 1;

// }
// }

// 2.MAXIMUM NUMBER
// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// if (a > b) {
// System.out.println(a);
// } else if (b > c) {
// System.out.println(b);
// } else {
// System.out.println(c);
// }
// }
// }

// 3.FIBANOCII NUMBER
// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println(fab(n));
// }

// static int fab(int n) {
// if (n < 2) {
// return n;
// }
// return fab(n - 1) + fab(n - 2);
// }
// }

// 4.PRIME NUMBER

// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 0; i <= n; i++) {
// System.out.println(i + " " + isPrime(n));
// }
// }

// static boolean isPrime(int n) {
// if (n <= 1) {
// return false;
// }
// int c = 2;
// while (c * c <= n) {
// if (n % c == 0) {
// return false;
// }
// c++;
// }
// return true;
// }
// }

// 5. Reverse the given number

// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// reverse(n);
// System.out.println(sum);
// }

// static int sum = 0;

// static void reverse(int n) {
// if (n == 0) {
// return;
// }
// int rem = n % 10;
// sum = sum * 10 + rem;
// reverse(n / 10);
// }
// }

// 6.FACTORIAL

// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println(fact(n));
// }

// static int fact(int n) {
// if (n <= 1) {
// return 1;
// }
// return n * fact(n - 1);
// }
// }

// 7.SUM OF TOTAL NUMBER OF DIGITS

// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println(sum(n));
// }

// static int sum(int n) {
// if (n == 0) {
// return 0;
// }
// return n + sum(n - 1);
// }
// }

// 8.SUM OF ALL INDIUAL DIGIT

// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println(sum(n));
// }

// static int sum(int n) {
// if (n == 0) {
// return 0;
// }
// return n % 10 + sum(n / 10);
// }
// }

// 9.PRODUCT OF INDIVIDUAL NUMBERS

// public class Example {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// System.out.println(sum(n));
// }

// static int sum(int n) {
// if (n % 10 == n) {
// return n;
// }
// return n % 10 * sum(n / 10);
// }
// }

// 10.COUNT NUMBER OF ZEROS IN A NUMBER

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));

    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}