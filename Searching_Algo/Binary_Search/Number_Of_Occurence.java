/**
 * Number_Of_Occurence of particular number i the arry using bianary search
 */
public class Number_Of_Occurence {

    public static void main(String[] args) {
        int arr[] = {1,2,2,4,4,4,5,7,8,4,4,5,6,7,8,9};

    int n1=binarySearch(arr,4,true);
    int n2=binarySearch(arr, 4, false);

    if(n1!=-1)
    {
        System.out.println("First Occurence :"+n1);
    }
    if(n2!=-1)
    {
        System.out.println("Last occurence :"+n2);
    }

    int occurence=findOccurence(arr,n1,n2,4);

    System.out.println("Occurence of targeted values in the array is :"+occurence);
    }

    static int findOccurence(int arr[],int n1,int n2,int target)
    {
        int count=0;
        for(int i=n1;i<=n2;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }

    static public int binarySearch(int arr[],int target,boolean isFirst)
    {
        int first=0;
        int last=(arr.length)-1;
        int ans=-1;
        while (first<=last) {
            int mid=(first+last)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(isFirst)
                {
                    last=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
            else if(arr[mid]<target)
            {
                first=mid+1;
            }
            else
            {
                last=mid-1;
            }
            
        }
        return ans;
    }
}