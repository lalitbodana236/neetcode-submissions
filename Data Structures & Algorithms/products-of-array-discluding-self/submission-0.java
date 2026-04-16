class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0]=1;

        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i-1]*pre[i-1];
        }

        suf[suf.length-1]=1;

        for(int i=suf.length-2;i>=0;i--){
            suf[i]=nums[i+1]*suf[i+1];
        }

          for(int i=0;i<n;i++){
            res[i]=pre[i]*suf[i];
        }

        return res;
    }
}  
