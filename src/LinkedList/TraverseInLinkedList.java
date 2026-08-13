package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class TraverseInLinkedList {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void recursiveDisplay(Node head){
        if(head == null) return;
        System.out.println(head.data);
        recursiveDisplay(head.next);
    }
    public static void main(String[] args) {
        // Created Node
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        // Link Node
        a.next = b;
        b.next = c;
        c.next = d;

       // display(a);
        recursiveDisplay(a);
    }
}
