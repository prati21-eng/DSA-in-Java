import java.util.logging.Handler;

class Heap
{
    int[] arr;
    int size,capacity;

    Heap()
    {
        arr=new int[10];
        arr[0]=-1;
        size=0;
    }

    public void insert(int element)
    {
        size++;
        arr[size]=element;

        int i=size;
        while (i>1) {
            int parent=i/2;

            if(arr[i]>arr[parent])
            {
                swap(arr,i,parent);
                i=parent;
            }
            else
            {
                break;
            }
        }
    }

    public void show()
    {
        if(size==0)
        {
            System.out.println("Heap is empty");
            return;
        }

        for(int i=1 ; i<=size;i++)
    {
        System.out.println(arr[i]);
    }
    }

    public void heapify(int[] nums,int i)
    {
        int largest=i;
        int left_child=i*2;
        int right_child=(i*2)+1;

        if(left_child < nums.length && nums[largest] < nums[left_child])
        {
            largest=left_child;
        }
        if(right_child < nums.length && nums[largest] < nums[right_child])
        {
            largest=right_child;
        }

        if(largest!=i)
        {
            swap(nums, largest, i);
            heapify(nums,largest);
        }
    }

    public void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

public class Heapify {

    public static void main(String[] args) {
        Heap h=new Heap();

        int[] nums={-1,44,67,32,67,90,32,100};

        for(int i=nums.length/2; i > 0 ;i--)
        {
            h.heapify(nums,i);
        }


        System.out.println("After Heapify ");
        for(int i=1;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}