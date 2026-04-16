class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet();

        for(Integer num : nums){
            if(!seen.add(num)) return true;
        }

        return false;
    }
}