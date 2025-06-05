import java.util.Scanner ;

class Node
{
    Node left;
    int data;
    Node right;
    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree
{
    Node head;
    public Tree()
    {
        head=null;
    }

    public Node builtTree()
    {
        System.err.println("Enter Data :");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        if(data==-1)
        {
            return null;
        }

        Node root=new Node(data);
        System.out.println("Enter Data for left of : "+root.data);
        root.left=builtTree();

        System.out.println("Enter Data for right of:"+root.data);
        root.right=builtTree();

        return root;

    }

    public void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }

    public void preorderTraversal(Node root)  //use to copy tree element as it is
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");  
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public void inorderTraversal(Node root)  //use to print the element of bst in sorted order
    {
        if(root==null)
        {
            return;
        }
         
        inorderTraversal(root.left);
        System.out.print(root.data+" "); 
        inorderTraversal(root.right);
    }

    public void postorderTraversal(Node root)  //use to delete node in tree
    {
        if(root==null)
        {
            return;
        }
          
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left_height=height(root.left);
        int right_height=height(root.right);

        return Math.max(left_height, right_height)+1;
    }

    public int diameterOfTree(Node root) //longest path of the tree
    {
        if(root==null)
            return 0;
        
        int A=diameterOfTree(root.left);
        int B=diameterOfTree(root.right);
        int AB=height(root.left)+height(root.right);

        return Math.max(A,Math.max(B, AB));
    }

    public boolean isBalancedTree(Node root)
    {
        if(root==null)
        {
            return true;
        }

        int lh=height(root.left);
        int rh=height(root.right);
        int difference=lh-rh;
        boolean current=difference<=1;

        boolean leftIsBalaced=isBalancedTree(root.left);
        boolean rightIsBalanced=isBalancedTree(root.right);

        return current && leftIsBalaced && rightIsBalanced;

    }

    public int sumOfTreeData(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left_sum=sumOfTreeData(root.left);
        int right_sum=sumOfTreeData(root.right);

        root.data=root.data+ left_sum+ right_sum;
        return root.data;
    }
}


public class Main {

    public static void main(String[] args) {
        Tree t=new Tree();

        Node root=t.builtTree();
        // System.out.println("Preorder Traversal ");
        // t.preorderTraversal(root);

        // System.out.println("Inorder traversal");
        // t.inorderTraversal(root);

        // System.out.println("Postorder traversal");
        // t.postorderTraversal(root);

        int height=t.height(root);
        System.out.println("Height of the tree is : "+height);

        System.out.println("Diameter Of the tree is "+t.diameterOfTree(root));
        System.out.println("Logest path total nodes :"+(t.diameterOfTree(root)+1));
        System.out.println(t.isBalancedTree(root));

        System.out.println("Sum of tree is "+t.sumOfTreeData(root));
        
    }
}