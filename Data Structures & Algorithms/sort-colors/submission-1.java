class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right = nums.length-1;

        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else {
                swap(nums,mid,right);
                right--;
            }
        }
    }

    public void swap(int[] nums,int idx1,int idx2){
        int temp = nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
    }
}