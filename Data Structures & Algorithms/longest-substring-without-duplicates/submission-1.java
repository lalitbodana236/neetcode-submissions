class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            int[] hash = new int[256];
           // Arrays.fill(hash,0);
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(hash[ch]==0){
                    hash[ch]=1;
                     max=Math.max(max,j-i+1);
                }else break;
               
            }
        }

        return max;
    }
}
