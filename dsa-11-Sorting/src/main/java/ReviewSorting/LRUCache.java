package ReviewSorting;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    HashMap<Integer, DNode> cacheMap=new HashMap<>();
    int size;
    int capacity;
    DNode head;
    DNode tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.size=0;
        this.head=new DNode();
        this.tail=new DNode();
        this.head.next=tail;
        this.tail.prev=head;
    }
    public void addNode(DNode node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }
    public void removeNode(DNode node){
        DNode prevNode=node.prev;
        DNode nextNode=node.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
    public void moveToFirst(DNode node){
        removeNode(node);
        addNode(node);
    }
    public int get(int key){
        // check hashmap if data exists in LRUCache
        DNode node=cacheMap.get(key);
        if (node==null) return -1;
        else {
           moveToFirst(node);
            return node.value;
        }
    }
    public DNode popLast(){
        DNode popped=tail.prev;
        removeNode(popped);
        return popped;
    }
    public void put(int key, int value){
        // if cache map contains key update value
        DNode node=cacheMap.get(key);
        if (node==null) {
            DNode newNode=new DNode(key,value);
            cacheMap.put(key, newNode);
            addNode(newNode);
            size++;
            if (size>capacity){
                DNode last=popLast();
                size--;
                cacheMap.remove(last.key);
            }
        } else {
            node.value=value;
            moveToFirst(node);
        }
        // else add as new item
    }
    public void printLRUCache(){
        for(Map.Entry<Integer,DNode> entry: cacheMap.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue().value);
        }
    }

}
