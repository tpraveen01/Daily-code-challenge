345.https:leetcode.com/problems/reverse-vowels-of-a-string/

  class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char [] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!isVowels(ch[start])){
                start++;
            }else if(!isVowels(ch[end])){
                end--;
            }else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    public static boolean isVowels(char ch){
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }else{
            return false;
        }
    }
}
