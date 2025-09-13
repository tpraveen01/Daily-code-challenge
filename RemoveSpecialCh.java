public class RemoveSpecialCh{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                System.out.print(ch);
            }else{
                ch++;
            }
        }
    }
}
