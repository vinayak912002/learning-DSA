package data_structures.hashMaps;

class ListNode{
    int key, val;
    ListNode next;//basically a singly linked list
    public ListNode(int key, int val, ListNode next){
        this.key = key;
        this.val = val;
        this.next = next;
    }
}
class MyHashMap {
    //the size and mult are prime numbers because it facilitates in a more even distribution of the keys
    static final int size = 19997;//the reason behind the choice of such a number must be due to empirical considerations
                                  //i.e. the hashMap should be big enough for the even distribution of keys, but should not be that big to limit the consumption of memory.
    static final int mult = 1258297;//the larger this value the more spread out the keys would be.
    ListNode[] data;

    public MyHashMap(){
        this.data = new ListNode[size];
    }

    private int hash(int key){
        return (int)((long)key * mult % size);
    }
    public void put(int key, int value){
        remove(key);
        int h = hash(key);
        ListNode node = new ListNode(key, value, data[h]);
        data[h] = node;
    }
    public int get(int key){
        int h = hash(key);
        ListNode node = data[h];
        //since we are using the node variable for the traversal, and it points to the head = data[h]
        //we do not need to declare the variable again in the for loop below
        for(; node != null; node = node.next){
            if(node.key == key) return node.val;
        }
        return -1;
    }
    public void remove (int key){
        int h = hash(key);
        ListNode node = data[h];
        if (node == null) return;
        if (node.key == key) data[h] = node.next;
        else for (; node.next != null; node = node.next){
            if(node.next.key == key) {
                node.next = node.next.next;
                return;
            }
        }
    }
}
