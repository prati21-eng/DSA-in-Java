class Element
{
    Object data;
    int priority;
    Element(int data,int priority)
    {
        this.data=data;
        this.priority=priority;
    }
}

class Priority_Queue
{
    Element[] arr;
    int size;
    int capacity;

   public Priority_Queue()
    {
        this.capacity=10;
        this.size=0;
        arr=new Element[this.capacity];
    }

    public Priority_Queue(int capacity)
    {
        this.capacity=capacity;
        this.size=0;
        arr=new Element[this.capacity];
    }

    public void enqueue(int data,int priority)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }

        Element newElement = new Element(data, priority);
        arr[size] = newElement;
        size++;
        for(int i=size-1 ; i > 0 ; i--)
        {
            if(this.arr[i].priority>this.arr[i-1].priority)
            {
                Element tmp=this.arr[i];
                this.arr[i]=this.arr[i-1];
                this.arr[i-1]=tmp;
            }
        }
    }

    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Dequeued item : Data "+this.arr[0].data+" Priority :"+this.arr[0].priority);
        for(int i=0;i<this.size;i++)
        {
            this.arr[i]=this.arr[i+1];
        }
        // this.arr[size - 1] = null;
        this.size--;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Linked list is empty");
            return;
        }

        for(int i=0;i<this.size;i++)
        {
            System.out.println("Data : "+this.arr[i].data+" Priority :"+this.arr[i].priority);
        }
        
    }

    public boolean isFull()
    {
        return this.size==this.capacity;
    }

    public boolean isEmpty()
    {
        return size==0;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Priority_Queue pq=new Priority_Queue();
        pq.enqueue(10,4);
        pq.enqueue(20, 2);
        pq.enqueue(30, 9);
        pq.enqueue(40,5);
        pq.display();
        pq.dequeue();
        pq.dequeue();
        pq.display();
    }
}