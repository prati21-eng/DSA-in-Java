public class Binary_Search {
    static private int binarySearch(int[] arr,int low,int high,int search)
    {
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==search)
            {
                return mid;
            }
            else if (search<arr[mid]) {
                return binarySearch(arr, low, mid-1, search);
            }
            else if (search>arr[mid]) {
                return binarySearch(arr, mid+1, high, search);
            }
        }

                return -1;
        
        
       
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter Elements that you wants to search : ");
        int search=sc.nextInt();
        int index=binarySearch(arr,0,arr.length-1,search);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index : "+index);
        }
    }
}