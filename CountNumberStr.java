public class CountNumberStr{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                sum+=(ch-'0');
            }
        }
        System.out.println(sum);
    }
}
