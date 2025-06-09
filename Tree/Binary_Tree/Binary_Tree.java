import java.util.Scanner;

class Node
{
    Node left;
    int data;
    Node right;

}
class QueueNode
{
    Node queueData;
    QueueNode left;
    QueueNode right;
}
class Queue
{
    QueueNode front;
    QueueNode rear;
}


public class Binary_Tree {
    static void printTree(Node rootNode)
    {
        if(rootNode==null)
        {
            return;
        }
        else
        {
            System.out.println(rootNode.data);
            printTree(rootNode.left);
            printTree(rootNode.right);
        }
    }
    static Node createNode(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        newNode.left=null;
        newNode.right=null;
        return newNode;
    }
    static Node builtTree()
    {
        Scanner sc=new Scanner(System.in);
        int data;
        Node root=null;
        System.out.println("Enter Data");
        data=sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        else
        {
            root=createNode(data);
            System.out.println("Enter data for "+root.data+" left");
            root.left=builtTree();
            System.out.println("Enter Data for "+root.data+" right");
            root.right=builtTree();
            return root;
        }

    }
    public static void main(String[] args){
        Node rootnode=null;
        rootnode=builtTree();

        printTree(rootnode);

    }
}