class Circular_Queue
{
    Object arr[];
    int capacity;
    int rear;
    int front;
    int size;

    public Circular_Queue()
    {
        this.capacity=10;
        arr=new Object[this.capacity];
        this.size=0;
        this.front=-1;
        this.rear=-1;
    }
    public Circular_Queue(int capacity)
    {
        this.capacity=capacity;
        arr=new Object[this.capacity];
        this.size=0;
        this.front=-1;
        this.rear=-1;
    }

    public void enqueue(Object data)
    {
        if(isFull()){

            System.out.println("Queue is full");;
            return;
        }

        this.rear=(this.rear+1)%this.capacity;
        this.arr[this.rear]=data;
        this.size++;
    }

    public Object dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }

        this.front=(this.front+1)%this.capacity;
        this.size--;
        return this.arr[this.front];
        
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }

        int temp=this.front+1;

        for(int i=0;i<size;i++)
        {
            System.out.println(this.arr[temp]);
            temp=(temp+1)%this.capacity;
        }
    }

    public boolean isEmpty()
    {
        return this.size==0;
    }
    public boolean isFull()
    {
        return this.size==this.capacity;
    }
}
public class Main {
    public static void main(String[] args) {
        Circular_Queue cqueue=new Circular_Queue();
        System.out.println(cqueue.capacity);

        cqueue.enqueue(10);
        cqueue.enqueue(20);;
        cqueue.enqueue(30);
        cqueue.enqueue(40);
        cqueue.enqueue(50);
        cqueue.display();
        System.out.println("Dequeue element :"+cqueue.dequeue());
        
        cqueue.display();
        System.out.println("Dequeue element :"+cqueue.dequeue());
        System.out.println("Dequeue element :"+cqueue.dequeue());
        System.out.println("Dequeue element :"+cqueue.dequeue());
        cqueue.display();
    }
     
}