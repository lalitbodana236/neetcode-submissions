class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int[] result = new int[k];

        for(int i=0;i<k;i++){

            int maxFreq = 0;
            int element = 0;

            for(Map.Entry<Integer,Integer> entry : freq.entrySet()){

                if(entry.getValue() > maxFreq){
                    maxFreq = entry.getValue();
                    element = entry.getKey();
                }
            }

            result[i] = element;
            freq.remove(element);
        }

        return result;
    }
}
