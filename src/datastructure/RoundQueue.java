package datastructure;

public class RoundQueue {

    private long[] a;
    private int size;
    private int nItems;
    private int front;
    private int rear;

    public RoundQueue(int maxSize){
        this.size = maxSize;
        this.a = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long value){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        rear = ++rear%size;
        a[rear] = value;
        nItems++;
    }

    public long remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return 0;
        }
        nItems--;
        front = front%size;
        return a[front++];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int item = front;
        for(int i = 0; i < nItems; i++){
            System.out.print(a[item++ % size] + " ");
        }
        System.out.println();
    }

    public long peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return 0;
        }
        return a[front];
    }

    public boolean isFull(){
        return (nItems == size);
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public int size(){
        return nItems;
    }

    public static void main(String[] args) {
        RoundQueue queue = new RoundQueue(10);
        queue.insert(1231);
        queue.insert(342);
        queue.insert(878);
        queue.display();

        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.size());
        queue.display();

    }
}
