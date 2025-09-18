https://leetcode.com/problems/reverse-words-in-a-string/submissions/1774684211/?envType=problem-list-v2&envId=string

class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" +");
        StringBuilder result=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
