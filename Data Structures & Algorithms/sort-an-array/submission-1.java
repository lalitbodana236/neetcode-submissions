class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return nums;
        }

        int mid = n/2;
        int[] leftArr = new int[mid];
        int i=0;
       while(i<mid){
            leftArr[i]=nums[i];
            i++;
        }

        int[] rightArr = new int[n-mid];
        int j=0;
        while(i<n){
            rightArr[j++]=nums[i++];
            
        }

        leftArr = sortArray(leftArr);
        rightArr = sortArray(rightArr);

        return merge(leftArr,rightArr);
        
    }

    private int[] merge(int[] l1,int[] l2){

        int[] ans = new int[l1.length+l2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<l1.length && j<l2.length){
            if(l1[i]>l2[j]){
                ans[k++]=l2[j++];
            }else{
                 ans[k++]=l1[i++];
            }
        }

        while(i<l1.length){
            ans[k++]=l1[i++];
        }

        while(j<l2.length){
            ans[k++]=l2[j++];
        }

        return ans;
    }
}