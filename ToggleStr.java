public class ToggleStr{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder add=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                add.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                add.append(Character.toUpperCase(ch));
            }else{
                add.append(ch);
            }
        }
        System.out.println(add);
    }
}
