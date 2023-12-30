package data_structures.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    private void add(int value){
        Node node;
        if(head.next == null) {
            node = new Node(value, null);
        }else{
            node = new Node(value, head.next);
        }
        head.next = node;
    }

    private void removebyval(int value){
        Node node  = head;
        Node prevnode = null;
        while(node != null && node.value != value) {
            //when the node is at beginning
            if(node.value == value && prevnode == null){
                head = node;
            }else if(node == null && prevnode.value == value){//when the node is at the end
                prevnode = null;
            } else if(node.value == value) {
                prevnode.next = node.next;
            }
            //in singly linked list to remove elements by value we have to use two pointers
            prevnode = node;
            node = node.next;
        }
    }

}


