class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        int longest=0;
        Set<Integer> set = new HashSet();
        for(int i:nums) set.add(i);

        for(int num:nums){
             if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
            }
}
