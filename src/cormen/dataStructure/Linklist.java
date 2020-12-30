package cormen.dataStructure;

class Node{
    Node prev;
    int key;
    Node next;
    Node(int key){
        this.prev = null;
        this.key = key;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    
    LinkedList(){
        this.head = null;
    }
    
    public void insert(int value){ //node inserted as first node leading to O(1) time complexity
        Node temp = new Node(value);
        temp.next = this.head;
        if(this.head != null)
            this.head.prev = temp;
        this.head = temp;
        temp.prev = null;
    }
    
    public void print(){
        Node ptr = head;
        System.out.println();
        while(ptr != null){
            System.out.print(ptr.key+" ");
            ptr = ptr.next;
        }
    }
    
    public Node search(int key){
        Node temp = this.head;
        while(temp != null && temp.key != key)
            temp = temp.next;
        return temp;
    }
}

public class Linklist{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(32);
        list.insert(23);
        list.insert(56);
        list.insert(9);
        list.print();
        int key = 32;
        Node found = list.search(key);
        if(found != null){
            System.out.println("\n"+found.key+" found!");
        }
        else
            System.out.println("\n"+key+" not found!");
        
    }
}


