class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap();

        for(String s : strs){
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            String word = String.valueOf(carr);
            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(s);
        }


        return new ArrayList<>(map.values());
    }
}
