public class RemoveVowels{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'||ch=='E' || ch=='I'||ch=='O'|| ch=='U'||ch=='a'||ch=='e' || ch=='i'||ch=='o'|| ch=='u'){
                ch++;
            }else{
                System.out.print(ch);
            }
        }
    }
}
