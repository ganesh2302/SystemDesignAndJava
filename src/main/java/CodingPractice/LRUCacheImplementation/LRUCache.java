package CodingPractice.LRUCacheImplementation;

import java.util.HashMap;

public class LRUCache {
    public class Node {
        int key;
        int val;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    HashMap<Integer, Node> hm = new HashMap<>();
    int maxCap = 5;

    //add node
    public void addNode(Node newnode){
        Node temp = head.next;

        newnode.prev = head;
        newnode.next = temp;

        head.next = newnode;
        temp.prev = newnode;

    }


    //delete node
    public void deleteNode(Node delnode){
        Node prev = delnode.prev;
        Node next = delnode.next;

        prev.next = next;
        next.prev = prev;

    }

    //get
    public int get(int key){
        if(hm.containsKey(key)){
            Node resNode = hm.get(key);
            int val = resNode.val;

            hm.remove(key);
            deleteNode(resNode);
            addNode(resNode);
            hm.put(key,head.next);
            return val;
        }return -1;
    }
    //put

    public void put(int key, int val){
        if (hm.containsKey(key)) {
            Node curr = hm.get(key);
            hm.remove(key);
            deleteNode(curr);
        }

        if (hm.size() == maxCap) {
            hm.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, val));
        hm.put(key, head.next);
    }

}
