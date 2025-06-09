
/**
 * First_And_Last_Occurence
 */
public class First_And_Last_Occurence {

    public static void main(String[] args) {
        int[] arr={1,3,4,4,5,6,7};

     int n=binarySearch(arr,4,true);//first occurence
     n=binarySearch(arr,4,false);//last occurence 
    if(n!=-1)
    {
        System.out.println("Elements first occurene at "+n);
    }
    else
    {
        System.out.println("Element Not found");
    }
    }

    static int binarySearch(int[] arr, int target,boolean isFirst)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(isFirst)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else if(arr[mid]<target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}