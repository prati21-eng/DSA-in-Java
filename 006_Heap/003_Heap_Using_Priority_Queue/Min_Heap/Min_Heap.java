import java.util.PriorityQueue;

public class Min_Heap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int arr[]={32,54,56,43,12,45,78};

        for(int i=0;i<arr.length;i++)
        {
            pq.offer(arr[i]);
        }

        System.out.println(pq);

        System.out.println(pq.poll());


    }
}