import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(87);
        pq.offer(42);
        pq.offer(21);
        pq.offer(90);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}