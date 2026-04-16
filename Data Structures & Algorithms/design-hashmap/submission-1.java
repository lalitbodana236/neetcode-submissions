class MyHashMap {

    int[] buckets;

    public MyHashMap() {
        buckets = new int[1000001];
        Arrays.fill(buckets,-1);
    }
    
    public void put(int key, int value) {
        buckets[key]=value;
    }
    
    public int get(int key) {
        if(buckets[key]!=-1)
            return buckets[key];

        return -1;
        
    }
    
    public void remove(int key) {
        if(buckets[key]!=-1)
            buckets[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */