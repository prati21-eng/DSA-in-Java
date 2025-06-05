class Element
{
    Object data;
    int priority;

    public Element(Object data,int priority)
    {
        this.data=data;
        this.priority=priority;
    }

    public String toString()
    {
        return "Data :"+this.data+" Priority :"+this.priority;
    }
}

class Node
{
    Element element;
    Node next;

    public Node(Object data,int priority)
    {
        this.element=new Element(data, priority);
        this.next=null;
    }
}

class Priority_Queue
{
    Node head;
    public Priority_Queue()
    {
        this.head=null;
    }

    public void enqueu(Object data,int priority)
    {
        Node newNode=new Node(data, priority);

       // If the queue is empty or the new node has higher priority than the head
       if (this.head == null || this.head.element.priority > newNode.element.priority) {
        newNode.next = this.head;
        this.head = newNode;
        return;
    }

    Node current = this.head;
    // Traverse the list to find the correct position
    while (current.next != null && current.next.element.priority <= newNode.element.priority) {
        current = current.next;
    }
    
    newNode.next = current.next;
    current.next = newNode;
    }

    public Object dequeue()
    {
        if(isEmpty()) 
        {
            System.out.println("Queue is empty");
            return null;
        }

        Element el=new Element(this.head.element.data, this.head.element.priority);
        this.head=this.head.next;
        return el;
    }

    public Object peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }

        Element el=new Element(this.head.element.data, this.head.element.priority);
        return el;

    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }

        Node travenode=this.head;

        while (travenode!=null) {
            System.out.println(travenode.element);
            travenode=travenode.next;
        }
    }

    public boolean isEmpty()
    {
        return this.head==null;
    }


}

public class Main {

    public static void main(String[] args) {
        Priority_Queue pq=new Priority_Queue();

        pq.enqueu(10, 20);
        pq.enqueu(20, 4);
        pq.enqueu(40, 15);
        pq.display();
    }
}