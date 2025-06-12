import java.util.Arrays;


public class Array_Highest_Sequence {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("How many elemnets you wants to insert : ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter the elements in the array :");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        

        Arrays.sort(arr1);
        int count = 1 , m = 0;
        for(int i=0 ; i<n-1 ; i++)
        {
            if (arr1[i]+1 == arr1[i+1])
            {
                count++;
            }
            else 
            {
                m = Math.max(m,count);
                count = 1;
            }
        }
        System.out.println("Longest common subsequence is :"+Math.max(count,m));
    }
}
