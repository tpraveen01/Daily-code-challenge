public class Countvowels{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'|| ch=='E' || ch=='I' ||ch=='O' || ch=='U' ||ch=='a'|| ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
