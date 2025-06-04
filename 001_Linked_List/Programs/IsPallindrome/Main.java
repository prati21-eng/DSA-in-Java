class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList
{
    Node head;
    public LinkedList()
    {
        this.head=null;
    }

    public void add(int data)
    {
        Node newnode=new Node(data);
        if(this.head==null)
        {
            this.head=newnode;
        }
        else
        {
            Node travNode=head;

            while (travNode.next!=null) {
                travNode=travNode.next; 
            }

            travNode.next=newnode;
        }
    }

    public void display()
    {
        if(this.head==null)
            System.out.println("Linked List is Empty");
        
        else
        {
            Node traNode=head;
            while (traNode!=null) {
                System.out.println(traNode.data);
                traNode=traNode.next;
            }
        }
    }

    public boolean isPallindrome()
    {
        if(this.head==null)
            return false;
        if(this.head.next==null)
            return true;


            Node fast=head, slow=head;

            while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;   
            }

            Node firstList=head;
            Node secondList=reverceList(slow.next);

            while (secondList!=null) {
                if(firstList.data!=secondList.data)
                {
                    return false;
                }
                secondList=secondList.next;
                firstList=firstList.next;
            }
        return true;
    }

    public Node reverceList(Node first)
    {
        if (first.next==null) {
            return first;
        }

        Node previous=null;
        Node current=first;
        Node forword=null;

        while (current!=null) {
            forword=current.next;
            current.next=previous;
            previous=current;
            current=forword;
            
        }

        return previous;
    }

    public int countNode()
    {
        int count=0;

        if(this.head==null)
        {
            return 0;
        }
        if (this.head.next==null) {
            return 1;
        }

        Node traNode=this.head;

        while (traNode!=null) {
            count++;
            traNode=traNode.next;
        }

        return count;
    }
}

/**
 * Main
 */
public class Main {

     public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(20);
        ll.add(10);
        System.out.println(ll.countNode());
        ll.display();
        System.out.println(ll.isPallindrome());
     }
}