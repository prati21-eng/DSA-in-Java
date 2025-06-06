public class Merge_Sort
{
    private static  void show(int[] arr,String msg)
    {
        if(arr==null)
        {
            System.out.println("Arreay is empty");
            return;
        }
        if(msg!=null)
        {
            System.out.println(msg);
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        show(arr,"Before Sorting");
        mergeSort(arr,0,arr.length-1);
        show(arr, "After sorting");
    }
    private static void mergeSort(int[] arr, int low, int high) {
    
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(arr, low, mid); //for left side
            mergeSort(arr, mid+1, high); //for right side;
            mergeFunc(arr,low,mid,high);
        }
    }
    private static void mergeFunc(int[] arr, int low, int mid, int high) {
        
        int N1=(mid-low)+1;
        int N2=(high-mid);
        int a1[]=new int[N1];
        int a2[]=new int[N2];

        for(int i=0;i<N1;i++)
        {
            a1[i]=arr[low+i];
        }
        for(int i=0;i<N2;i++)
        {
            a2[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=0;
        while (i<N1 && j<N2)
         {
            if(a1[i]<a2[j])
            {
                arr[low+k]=a1[i];
                i++;
                k++;
            }
            else
            {
                arr[low+k]=a2[j];
                j++;
                k++;
            }
        }

        while (i<N1) {
            arr[low+k]=a1[i];
            i++;
            k++;
        }
        while (j<N2) {
            arr[low+k]=a2[j];
            j++;
            k++;
        }
    }
}