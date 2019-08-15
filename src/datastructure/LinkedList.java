package datastructure;

public class LinkedList {

    private Link first;
    private int nElem; //node amount in link list
    public void insertFirst(int value){ //add front node
        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;
        nElem++;
    }

    public Link deleteFirst(){
        if(isEmpty()){
            System.out.println("LinkedList is null");
            return null;
        }
        Link temp = first;
        first = first.next;
        nElem--;
        return temp;
    }

    public void insert(int value){
        Link newLink = new Link(value);
        Link previous = null;
        Link current = first;
        while(current != null && value > current.data){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            first = newLink;
        }else {
            previous.next = newLink;
        }
        newLink.next = current;
        nElem++;
    }

    public Link find(int value){
        Link current = first;
        while(current.data != value){
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    public Link delete(int value){
        Link current = first;
        Link previous = first;
        while (current.data != value){
            if(current.next == null){
                return null;
            }
            previous = current;
            current = current.next;
        }
        if(current == first){
            first = first.next;
        }else {
            previous.next = current.next;
        }
        nElem--;
        return current;
    }

    public void displayList(){
        if(isEmpty()){
            System.out.println("Linked list is null");
            return;
        }
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public int size(){
        return nElem;
    }

    class Link{
        public int data;
        public Link next;

        public Link(int data){
            this.data = data;
            this.next = null;
        }
        public void displayLink(){
            System.out.println("{" + data + "}");
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(123);
        linkedList.displayList();
        linkedList.insert(2141);
        linkedList.displayList();
        linkedList.insert(24352);
        linkedList.displayList();
        linkedList.insert(234);
        linkedList.displayList();

        linkedList.delete(2141);
        linkedList.displayList();
    }
}
