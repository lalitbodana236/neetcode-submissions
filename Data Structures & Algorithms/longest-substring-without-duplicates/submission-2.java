class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
         int[] hash = new int[256];

         int left=0;
        int right=0;
         
         while(right<n){
            char ch = s.charAt(right);
            while(hash[ch]!=0){
                hash[s.charAt(left)]=0;
                left++;
                
            }

             max=Math.max(max,right-left+1);
             hash[ch]=1;
             right++;
         }
       

        return max;
    }
}
