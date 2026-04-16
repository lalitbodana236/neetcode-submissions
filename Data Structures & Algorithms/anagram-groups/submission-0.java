class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap();

        for(String s : strs){
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            String word = String.valueOf(carr);
            map.putIfAbsent(word,new ArrayList());
            List<String> list = map.get(word);
            list.add(s);
            map.put(word,list);
        }


        return new ArrayList<>(map.values());
    }
}
