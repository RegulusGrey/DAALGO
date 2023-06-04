class HashTable {
    private int size;
    private LinkedList[] buckets;
    public HashTable(int size) {
        this.size = size;
        this.buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.buckets[i] = new LinkedList();
        }
    }
    private int hash(int key) {
        return key % this.size;
    }
    public void add(int key, int value) {
        int index = hash(key);
        this.buckets[index].add(value);
    }
    public void remove(int key, int value) {
        int index = hash(key);
        this.buckets[index].remove(value);
    }
    public boolean search(int key, int value) {
        int index = hash(key);
        return this.buckets[index].search(value);
    }
}
