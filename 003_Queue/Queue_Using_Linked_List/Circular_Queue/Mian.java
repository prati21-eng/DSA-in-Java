class Node
{
    Object data;
    Node next;
    public Node(Object data)
    {
        this.data=data;
        this.next=null;
    }
}

class Queue
{
    Node front;
    Node rear;
    public Queue()
    {
        this.rear=null;
        this.front=null;
    }

    public void enqueue(Object data)
    {
        Node newnode=new Node(data);

        if(this.front==null && this.rear==null)
        {
            this.front=this.rear=newnode;
            return;
        }

        this.rear.next=newnode;
        this.rear=newnode;
        this.rear.next=this.front;

    }

    public Object dequeue()
    {
        if(this.rear ==null && this.front==null)
        {
            System.out.println("queue is empty");
            return null;
        }

        Object data=this.front.data;
        this.front=this.front.next;
        this.rear=this.front;
        if(this.front==null)
        {
            this.rear=null;
        }
        return data;

    }

    public Object peek()
    {
        if(this.front==null && this.rear==null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.data;
    }

    public void display()
    {
        if(this.rear==null && this.front==null)
        {
            System.out.println("Queue is empty");
            return;
        }

        Node trevenode=this.front;

        while (trevenode!=null) {
            System.out.println(trevenode.data);
            trevenode=trevenode.next;
        }
    }
}

public class Mian {

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.display();
        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println();
        queue.display();
        System.out.println(queue.peek());

    }
}