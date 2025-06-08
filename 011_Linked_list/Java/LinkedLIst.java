import java.util.Scanner;

class Node
{
    int data;
    Node next;

    public Node(int data ,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

public class LinkedLIst {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        
        Node rootNode=null;
        int choice=0;
        do{
            System.out.println("1:Create Linked List");
            System.out.println("2:Display Linked List");
            System.out.println("3:Insert at First" );
            System.out.println("4:Insert At Last");
            System.out.println("5:Delete At First");
            System.out.println("6:Delete At Last");
            System.out.println("0:Exit");
            System.out.println("Enter Your Choice :");
            choice=sc.nextInt();

            switch (choice) {
                case 1:rootNode=createLinkedList(rootNode);
                    break;
                case 2:displayLinkedList(rootNode);
                    break;
                case 3:rootNode=insertAtFirst(rootNode);
                    break;
                case 4:rootNode=insertAtLast(rootNode);
                    break;
                case 5:rootNode=deleteAtFirst(rootNode);
                    break;
                case 6:rootNode=deleteAtLast(rootNode);
                    break;
                case 0:System.out.println("Exit");
                    break;
                default:System.out.println("Invalid Choice");
                    break;
            }
        }while(choice!=0);
    }
    private static void displayLinkedList(Node rootNode) {
        Node tempNode=rootNode;
        if(tempNode==null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            while (tempNode!=null) {
                System.out.println(tempNode.data+" ");
                tempNode=tempNode.next;
            }
        }
    }
    private static Node createNode()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data");
        int data=sc.nextInt();
        Node newnode=new Node(data, null);
        return newnode;
    }
    private static Node createLinkedList(Node rootNode) {
         Node tempNode=rootNode;
        Node newNode=createNode();

        if(rootNode==null)
        {
            rootNode=newNode;
        }
        else
        {
            while (tempNode.next!=null) {
                tempNode=tempNode.next;
            }
            tempNode.next=newNode;
        }
        return rootNode;
    }

    private static Node insertAtFirst(Node rootNode)
    {
        Node newNode=createNode();
        newNode.next=rootNode;
        rootNode=newNode;
        return rootNode;
    }

    private static Node insertAtLast(Node roootNode )
    {
        return createLinkedList(roootNode);
    }

    private static Node deleteAtFirst(Node rootNode)
    {
        
        return rootNode;
    }
    private static Node deleteAtLast(Node rootNode)
    {
        if(rootNode==null)
        {
            System.out.println("Linked List Is Empty");
        }
        else if(rootNode.next==null)
        {
            rootNode=null;
        }
        else
        {
            Node travenode=rootNode;
            while (travenode.next.next!=null) {
                travenode=travenode.next;
            }
            travenode.next=null;
        }
        return rootNode;
    }
}