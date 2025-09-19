// 2942.leetcode.com/problems/find-words-containing-character/?envType=problem-list-v2&envId=string

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }
        return result;
    }
}
  
