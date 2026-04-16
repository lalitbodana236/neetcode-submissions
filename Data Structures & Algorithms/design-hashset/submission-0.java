class MyHashSet {

    int[] freq;

    public MyHashSet() {
        freq = new int[1000000];
        Arrays.fill(freq,0);
    }
    
    public void add(int key) {
        freq[key]=1;

    }
    
    public void remove(int key) {
        freq[key]=0;
    }
    
    public boolean contains(int key) {
        return freq[key]!=0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */