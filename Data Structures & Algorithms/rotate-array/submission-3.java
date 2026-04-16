class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        rot(nums,0,nums.length-1);
        rot(nums,0,k-1);
        rot(nums,k,nums.length-1);
    }

    public void rot(int[] nums,int left,int right){

        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}