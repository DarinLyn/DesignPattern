package datastructure;

public class ArrayStack {
    private long[] a;
    private int size;
    private int top;

    public ArrayStack(int size) {
        this.size = size;
        this.a = new long[size];
        this.top = -1;
    }

    public void push(long value){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        a[++top] = value;
    }

    public long peek(){
        if(isEmpty()){
            System.out.println("no data in the stack");
            return 0;
        }
        return a[top];
    }

    public long pop(){
        if(isEmpty()){
            System.out.println("no data in the stack");
            return 0;
        }
        return a[top--];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == size - 1);
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(1321);
        stack.push(342);
        stack.push(8768);
        stack.display();

        System.out.println("do peek");
        System.out.println(stack.peek());

        System.out.println("do pop");
        stack.pop();
        stack.display();

    }
}
