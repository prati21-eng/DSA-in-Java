import java.util.Scanner;

class Node
{
    int data;
    Node next;

    public Node(int data,Node next)
    {
        this.data=data;
        this.next=null;
    }
}

class MyLinkedList{
    Node head;
    public MyLinkedList()
    {
        head=null;
    }

    //add the elements in the linked list
    public void add(int data)
    {
        Node tempNode=head;
        Node new_node=new Node(data, null);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            while (tempNode.next!=null) {
                tempNode=tempNode.next;
            }
            tempNode.next=new_node;
        }
    }

    //insert at first
    public void addFirst(int data)
    {
        Node new_node=new Node(data, null);
        new_node.next=head;
        head=new_node;
    }

    //insert in the last
    public void addLast(int data)
    {
       add(data);
    }

    //remove at first
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("Linked List Is Empty");
        }
        else
        {
            head=head.next;
        }
    }

    //remove at last
    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("Linked List Is Empty");
        }
        else if (head.next==null) {
            head=null;
        }
        else
        {
            Node tempnode=head;
            while (tempnode.next.next!=null) {
                tempnode=tempnode.next;
            }
            tempnode.next=null;
        }
    }

    //display linked list
    public void displayList()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            Node tempnode=head;
            while (tempnode!=null) {
                System.out.print(tempnode.data+"=>");
                tempnode=tempnode.next;
            }
        }
    }

    public int countNode()
    {
        int count=0;
        if(head==null)
        {
            return 0;
        }
        else
        {
            Node travenode=head;
            while (travenode!=null) 
            {
                count++;
                travenode=travenode.next;    
            }
        }
        return count;
    }

    //insert at specified position
    public void insertAtPosition(int data,int pos)
    {
        int n=countNode();
        if(pos<1||pos>(n+1))
        {
            System.out.println("Invalid position");
        }
        else if(pos==1)
        {
            addFirst(data);
        }
        else if(pos==(n+1))
        {
            addLast(data);
        }
        else
        {
            Node travnode=head;
            Node newnode=new Node(data, null);
            for(int i=1;i<(pos-1);i++)
            {
                travnode=travnode.next;
            }
            newnode.next=travnode.next;
            travnode.next=newnode;
        }


    }

    //delete at specified position
    public void deletetAtPosition(int pos)
    {
        int n=countNode();
        if(pos<1||pos>(n))
        {
            System.out.println("Invalid position");
        }
        else if(pos==1)
        {
            removeFirst();
        }
        else if(pos==(n+1))
        {
            removeLast();
        }
        else
        {
            Node travnode=head;
            Node tempNode=null;
            for(int i=1;i<(pos-1);i++)
            {
                travnode=travnode.next;
            }
            tempNode=travnode.next;
            travnode.next=tempNode.next;
        }


    }

    public void reverceNodesOfLinkeList()
    {

        if(this.head==null)
        {
            System.out.println("Linked List Is Empty");
            return;
        }

        Node traveNode=this.head;

        while (traveNode!=null) {
            Node tempnode=traveNode;
            
        }
    }


//reverce singly linked list using recursion
public void reverceList(Node currhead)
{
    if(currhead==null)
        return;
    
    reverceList(currhead.next);
    System.out.println(currhead.data+"=>");
}

}
public class Main {

    public static void main(String[] args) {
        MyLinkedList ll=new MyLinkedList();
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int choice=0;
        do {
            System.out.println();
            System.out.println("1.Add Element ");
            System.out.println("2.Add First");
            System.out.println("3.Add Last");
            System.out.println("4.Remove First");
            System.out.println("5.Remove Last");
            System.out.println("6.Display");
            System.out.println("7:Count Node");
            System.out.println("8.Insert at position");
            System.out.println("9.Reverce List");
            System.out.println("10.Delete at Position");
            System.out.println("0.Exit");
            System.out.println("Enter Your Choice");
            int data=0;
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("Enter Data");
                        data=sc.nextInt();
                        ll.add(data);
                    break;

                case 2:
                        System.out.println("Enter Data");
                        data=sc.nextInt();
                        ll.addFirst(data);
                        break;

                case 3:
                        System.out.println("Enter Data");
                        data=sc.nextInt();
                        ll.addLast(data);
                        break;

                case 4:
                        ll.removeFirst();
                        break;

                case 5:
                        ll.removeLast();
                        break;

                case 6:ll.displayList();
                        break;

                case 7:int count=ll.countNode();
                        System.out.println("Total Nodes :"+count);
                        break;
                
                case 8:System.out.println("Enter Data :");
                        data=sc.nextInt();
                        System.out.println("Enter Position :");
                        int pos=sc.nextInt();
                        ll.insertAtPosition(data, pos);
                        break;
                
                case 9:ll.reverceList(ll.head);
                        break;

                case 10:System.out.println("Enter postion to delete :");
                        int pos1=sc.nextInt();
                        ll.deletetAtPosition(pos1);
                        break;

                case 0:System.out.println("Exit");
                        break;
                default:System.out.println("Invalid Choice");
                    break;
            }
        } while (choice!=0);

    }
}