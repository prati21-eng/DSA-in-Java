class Dequeue {
    Object[] arr;
    int rear;
    int front;
    int capacity;
    int size;

    public Dequeue() {
        this.capacity = 10;
        this.arr = new Object[this.capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public Dequeue(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[this.capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public void insertRear(Object data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            this.front = 0;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.arr[this.rear] = data;
        this.size++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int tmp = this.front;
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[tmp]);
            tmp = (tmp + 1) % this.capacity;
        }
    }

    public Object deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Object tmp = this.arr[front];
        if (this.size == 1) {
            this.front = this.rear = -1;
        } else {
            this.front = (this.front + 1) % this.capacity;
        }
        this.size--;
        return tmp;
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insertFront(Object data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(this.front==-1)
        {
            this.front=0;
        }

        this.front=((this.front+1)+this.capacity)%this.capacity;
        this.arr[front]=data;
    }
}

public class Main {

    public static void main(String[] args) {
        Dequeue dq = new Dequeue();
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertRear(30);
        dq.insertFront(40);
        dq.deleteFront();
        dq.display();
    }
}