class Heap
{

    public void heapify(int[] arr,int index,int n)
    {
            int leftIndex=(2*index)+1;
            int rightIndex=(2*index)+2;
            int maximum=index;
            if(leftIndex < n && arr[leftIndex]>arr[maximum])
            {
                maximum=leftIndex;
            }
            if(rightIndex < n && arr[rightIndex] > arr[maximum])
            {
                maximum=rightIndex;
            }

            if(maximum!=index)
            {
                swap(arr,maximum,index);
                heapify(arr, maximum, n);

            }  
    }
    public void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public void heapSort(int[] arr)
    {
        int size=arr.length;

        for (int i = size - 1; i >= 0; i--) {
            swap(arr, 0, i);  // Move current root to end
            heapify(arr, 0, i);  // Heapify the reduced heap
        }
    }
}

public class Heap_Sort {

    public static void main(String[] args)
    {
        Heap h=new Heap();
        int[] arr={32,65,43,89,87,54,39,80};
        
        for(int i=(arr.length-1)/2 ; i >= 0; i--)
        {
           h.heapify(arr,i,arr.length-1);
        }

        System.out.println("Array After heapify : ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        h.heapSort(arr);
        System.out.println("After Heap sort :");

        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}