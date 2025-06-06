class Heap
{
    int[] arr;
    int capacity;
    int size;

    public Heap()
    {
        this.capacity=10;
        arr=new int[this.capacity];
        arr[0]=-1;
        this.size=0;
    }

    public Heap(int capacity)
    {
        this.capacity=capacity;
        arr=new int[this.capacity];
        this.size=0;
    }


    public void insert(int element)
    {
        this.size++;
        this.arr[this.size]=element;
        int i=size;

        while (i>1) {
            int parent=i/2 ;


            if(this.arr[i]>arr[parent])
            {
                swap(this.arr,i,parent);
                i=parent;
            }
            else
            {
                break;
            }
        }
    }

    public int delete()
    {

        if(this.size==0)
        {
            System.out.println("Heap is Empty");
            return 0;
        }
        int del=arr[1];
        this.arr[1]=this.arr[size];
        size--;
        int i=1;

        while(i<size)
        {int leftChild = 2 * i;
            int rightChild = 2 * i + 1;
            int maxIndex = i;

            if (leftChild <= size && arr[leftChild] > arr[maxIndex]) {
                maxIndex = leftChild;
            }
            if (rightChild <= size && arr[rightChild] > arr[maxIndex]) {
                maxIndex = rightChild;
            }

            if (maxIndex!= i) {
                swap(arr, i, maxIndex);
                i = maxIndex;
            } else {
                break;
            }
        }


        return del;
    }

    public void display()
    {
        for(int i=1;i<=this.size;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}

public class HeapImplementation {

    public static void main(String[] args) {
        Heap heap=new Heap();
        heap.insert(10);;
        heap.insert(20);
        heap.insert(40);
        heap.insert(50);
        heap.insert(60);
        heap.insert(23);
        heap.insert(10000);
        heap.display();

        System.out.println("");
        System.out.println("Deleted item "+heap.delete());

        System.out.println("After deletion heap");
        heap.display();
    }
}