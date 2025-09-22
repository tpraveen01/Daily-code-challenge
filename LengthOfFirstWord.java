import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(length(s));
    }
    public static int length(String s){
        int count=0;
        String str=s.trim();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
