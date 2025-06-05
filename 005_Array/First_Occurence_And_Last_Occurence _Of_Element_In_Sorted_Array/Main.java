public class Main
{
    public static int firstOcc(int[] arr,int start,int end,int search)
    {
        int mid=(start+end)/2;
        int ans=-1;

        while (start<=end) {

            if(arr[mid]==search)
            {
                ans=mid;
                int next=firstOcc(arr, start, mid-1, search);
            }
            else if (arr[mid]<search) {
                firstOcc(arr, start, mid-1, search);
            }
            else
            {
                firstOcc(arr, mid+1, end, search);
            }
            
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,3,3,3,4,5,6};

        int firstOccurence=firstOcc(arr,0,arr.length-1,3);
    }
}