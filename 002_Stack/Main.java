class Stack
{
    Object[] arr;
    int capacity;
    int top;
    Stack() // for initial capacity
    {
        this.capacity=10;
        this.arr=new Object[this.capacity];
        top=-1;
    }

    Stack(int capacity)
    {
        this.capacity=capacity;
        this.arr=new Object[this.capacity];
        top=-1;    
    }
    public boolean isOverflow()
    {
        return this.top==(this.capacity-1);
    }
    public void push(Object element)
    {
        if(this.isOverflow())
        {
            System.out.println("Stack is full");
            return;
        }
        else
        {
            this.arr[++this.top]=element;
        }
    }

    public boolean isUnderflow()
    {
        return this.top==-1;
    }

    public Object pop()
    {
        if(this.isUnderflow())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            int element =(int)this.arr[this.top];
            this.top--;
            return element;
        }
    }

    public Object peek()
    {
        if(isOverflow())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.arr[this.top];
    }

    public void display()
    {
        if(isUnderflow())
        {
            System.out.println("Stack is empty");
            return;
        }
        else
        {
            System.out.println("Stack:");
            for(int i=this.top;i>=0;i--)
            {
                System.out.println(this.arr[i]);
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println(stack.capacity);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.isOverflow());
        System.out.println(stack.isUnderflow());
        
    }
}