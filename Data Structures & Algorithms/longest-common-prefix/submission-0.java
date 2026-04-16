class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word= strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(word)==-1){
                word=word.substring(0,word.length()-1);
            }
        }

        return word;
    }
}