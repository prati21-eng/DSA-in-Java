import java.util.HashMap;

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
        Node newNode=new Node(data);
        if(head==null)
            this.head=newNode;
        else
        {
            Node temNode=this.head;
            while (temNode.next!=null) {
                temNode=temNode.next;
            }
            temNode.next=newNode;
            
        }
    }

    public void display()
    {
        if(this.head==null)
        {
            System.out.println("Liked List is empty");
            return;
        }   

        Node travNode=this.head;
        
        while (travNode!=null) {
            System.out.println(travNode.data);
            travNode=travNode.next;
            
        }
    }

    detect cycle using map

    public boolean isCyclic()
    {
        if (this.head==null) {
            return false;
        }
        if (this.head.next==this.head) {
            return true;
        }

        HashMap<Node,Boolean> map=new HashMap<Node,Boolean>();

        Node traNode=this.head;

        while (traNode==null) {
            
            if(map.containsKey(traNode))
            {
                return true;
            }
            map.put(traNode, true);
            traNode=traNode.next;
        }
        return false;
    }


    


}
public class Main {

     public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll.isCyclic());
     }
}