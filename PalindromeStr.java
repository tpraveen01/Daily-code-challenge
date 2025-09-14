import java.util.Scanner;
public class PalindromeStr{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        String reversed=new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println(str+"is Palindrome");
        }else{
            System.out.println(str+"is  Not Palindrome");
        }
    }
}
