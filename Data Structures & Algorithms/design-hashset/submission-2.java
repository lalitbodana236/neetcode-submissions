class MyHashSet {

    boolean[] seen;
    int size;

    public MyHashSet() {
        seen=new boolean[1000000];
        size=seen.length;
    }
    
    public void add(int key) {
        int idx = hash(key);

        seen[idx]=true;
    }
    
    public void remove(int key) {
         int idx = hash(key);

        seen[idx]=false;
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        return seen[idx];
    }

    public int hash(int key){
        return key%size;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */