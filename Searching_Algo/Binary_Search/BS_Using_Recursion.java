public class BS_Using_Recursion {

   public static void main(String[] args) {
    int [] arr={1,2,3,4,5};

    int n=binarySearch(arr,0,arr.length-1,1111);
    if(n!=-1)
    {
        System.out.println("Element found at position :"+n);
    }
    else{
        System.out.println("Elemnent not found");
    }
   }

   public static int binarySearch(int[] arr,int low,int high,int target)
   {
    int start =low;
    int end=high;
    int  mid=(low+high)/2;
    if(low>=high)
    {
        return -1;
    }
    if(target==arr[mid])
    {
        return arr[mid];
    }
    else if(target<arr[mid])
    {
        return binarySearch(arr, start, mid-1, target);
    }
    else{
        return binarySearch(arr, mid+1, high, target);
    }
   }
    
}
