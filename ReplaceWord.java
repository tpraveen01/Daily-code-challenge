public class ReplaceWord{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        String result=str.replace("\\b"+st1+"\\b" ,st2);
        System.out.println(str);
        System.out.println(result);
        // System.out.println(str);
    }
}
