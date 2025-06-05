class Node
{
    Node left;
    int data;
    Node right;

    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

class BST
{
    Node root;

    public void insert(int data)
    {
        this.root=insertData(this.root,data);
    }


    private Node insertData(Node root,int data)
    {
        if(root == null)
        {
            Node newNode =new Node(data);
            this.root = newNode;
        }
        else
        {
            if(data < root.data)
            {
                root.left =insertData(root.left, data);
            }
            else if(data > root.data)
            {
                root.right = insertData(root.right, data);
            }
        }
        return root;
    }

    public void preorderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void postorderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.data);
    }
    
    
    public void inoderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }

        inoderTraversal(root.left);
        System.out.println(root.data);
        inoderTraversal(root.right);
    }
}

public class Main {

    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(10);
        bst.insert(50);
        bst.insert(100);
        bst.insert(21);
        bst.insert(1);
        bst.insert(2);
        bst.insert(6);
        System.out.println();
    }
}