class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<String,List<String>> map = new HashMap();

        for(String word : strs){
            char[] carr = word.toCharArray();
            Arrays.sort(carr);
            String val = String.valueOf(carr);
            map.putIfAbsent(val,new ArrayList());
            map.get(val).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
