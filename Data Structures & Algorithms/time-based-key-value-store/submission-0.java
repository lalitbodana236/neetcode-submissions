class TimeMap {
    Map<String, List<Pair>> timeMap;
    public TimeMap() {
        timeMap = new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key, new ArrayList());

        timeMap.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        String ans = "";
        if (timeMap.containsKey(key)) {
            List<Pair> list = timeMap.get(key);
            int left = 0;
            int right = list.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int time = list.get(mid).timestamp;
                if (time == timestamp)
                    return list.get(mid).value;
                else if (time>timestamp) {
                    right = mid - 1;
                } else {
                    ans = list.get(mid).value;
                    left = mid + 1;
                }
            }
        }

        return ans;
    }
}

class Pair {
    String value;
    int timestamp;

    public Pair(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
