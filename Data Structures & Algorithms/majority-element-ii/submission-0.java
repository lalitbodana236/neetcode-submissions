class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        int k = nums.length/3;
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> list=  new ArrayList();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > k) { 
                list.add(entry.getKey());
            }
        }

        return list;
       
    }
}