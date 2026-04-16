class Solution {
    public int findDuplicate(int[] nums) {
       int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];     // 1 step
            fast = nums[fast];       
            fast = nums[fast];     // fast = 2 step ( written as also fast = nums[nums[fast]])

            if(slow == fast){    // cycle hai
                slow = 0;
                while(slow != fast){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
    }
}
