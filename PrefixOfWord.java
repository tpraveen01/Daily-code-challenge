1455.https:leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].startsWith(searchWord)){
                return i+1;
            }
        } 
        return -1;
    }
}
