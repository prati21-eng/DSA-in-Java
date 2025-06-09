/**
 * 001_Binary_Search
 */
public class Binary_Search_Using_Loop {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10};

    int n=binarySearch(arr,4);
    if (n==-1) {
        System.out.println("Element not found");
        
    }
    else
    {
        System.out.println("Element found at position "+n);
    }

}

public static int binarySearch(int[] arr,int target)
{
    int first=0;
    int last=(arr.length)-1;
    int index=-1;

    while (first<=last) {
        int mid=(first+last)/2;
        if(target==arr[mid])
        {
            index=mid;
            break;
        }
        else if(target<arr[mid])
        {
            last=mid-1;
        }   
        else if(target>arr[mid])
        {
            first=mid+1;
        }
        
    }
    return index;
    
}
}