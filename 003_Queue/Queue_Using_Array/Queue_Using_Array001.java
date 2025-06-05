import java.util.NoSuchElementException;

class Queue
{
    Object arr[];
    int capacity;
    int rear;
    int front;

    public Queue()
    {
        this.capacity=10;
        arr=new Object[10];
        int rear=-1;
        int front=-1;
    }
    public Queue(int capacity)
    {
        this.capacity=capacity;
        arr=new Object[this.capacity];
        int rear=-1;
        int front=-1;
    }

    //inserting element at the end of rear
    public void offer(Object element) //enqueu()
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }

        this.arr[++this.rear]=element;

    }

    public Object poll() //dequeue return element ar front if queue is empty then return null
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }

        Object tmp=this.arr[this.front+1];
        this.front++;
        return tmp;
    }

    public Object remove() //remove element if queue is empty then throw an exception
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        Object tmp=this.arr[this.front+1];
        this.front++;
        return tmp;
    }



    public Object element() //return element at front if queue is empty then raised exception
    {
        if (isEmpty()) {
          throw new NoSuchElementException();
        }
        
        return this.arr[this.front+1];
    }

    public Object peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }

        return this.arr[this.front+1];
    }

    public boolean isEmpty()
    {
        return this.front==this.rear;

    }
    public boolean isFull()
    {
        return this.rear==(this.capacity)-1;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        else
        {
            for(int i=this.front+1;i<=this.rear;i++)
            {
                System.out.println(this.arr[i]);
            }
        }
    }
}

public class Queue_Using_Array001 {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println();
        Queue queue=new Queue();
        queue.isEmpty();
        queue.isFull();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.display();
        queue.poll();
        System.out.println();
        queue.display();
        System.out.println();
        queue.remove();
        queue.display();
        System.out.println(queue.peek());
        queue.remove();

        
    }
}