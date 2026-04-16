class MyHashSet {

    private final int SIZE = 1000;
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }
    
    public void add(int key) {
        int i = hash(key);
        if (buckets[i] == null) buckets[i] = new ArrayList<>();
        if (!buckets[i].contains(key)) buckets[i].add(key);

    }
    
    public void remove(int key) {
        int i = hash(key);

        if (buckets[i] != null) 
            buckets[i].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
       int i = hash(key);
        return buckets[i] != null && buckets[i].contains(key);

    }
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */