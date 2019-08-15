package datastructure;

public class DoublyLinkedList {

    private Node first;
    private Node last;
    private int size;

    public DoublyLinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(long value){
        Node newLink = new Node(value);
        if(isEmpty()){
            last = newLink;
        }else {
            first.previous = newLink;
            newLink.next = first;
        }
        first = newLink;
        size++;
    }

    public void insertLast(long value){
        Node newLink = new Node(value);
        if(isEmpty()){
            first = newLink;
        }else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
        size++;
    }

    public Node deleteFirst(){
        if(first == null){
            System.out.println("List is empty");
            return null;
        }
        Node temp = first;
        if(first.next == null){
            last = null;
        }
        else {
            first.next.previous = null;
        }
        first = first.next;
        size --;
        return temp;
    }

    public Node deleteLast(){
        if(last == null){
            System.out.println("List is empty");
            return null;
        }
        Node temp = last;
        if(last.previous == null){
            first = null;
        }
        else {
            last.previous.next = null;
        }
        last = last.previous;
        size --;
        return temp;
    }

    public boolean insertAfter(long key, long value){   //insert node with value after node key
        Node current = first;
        while (current.data != key){
            current = current.next;
            if(current == null){
                System.out.println("key: " + key + " is non-existent");
                return false;
            }
        }
        if(current == last){
            insertLast(value);
        }
        else {
            Node newLink = new Node(value);
            newLink.next = current.next;
            current.next.previous = newLink;
            current.next = newLink;
            newLink.previous = current;
            size ++;
        }
        return true;
    }

    public Node deleteNode(long key){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                System.out.println("key: " + key + " is non-existent");
                return null;
            }
        }
        if(current == first){
                deleteFirst();
        }else if(current == last){
            deleteLast();
        }else {
            current.next.previous = current.previous;
            current.previous.next = current.next;
            size--;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List(first --> last): ");
        Node current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.println("List(last --> first): ");
        Node current = last;
        while (current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }

    class Node{
        public long data;
        public Node next;
        public Node previous;

        public Node(long value){
            data = value;
            next = null;
            previous = null;
        }

        public void displayLink(){
            System.out.println(data + " ");
        }
    }

}
