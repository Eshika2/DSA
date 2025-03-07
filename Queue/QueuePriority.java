package Queue;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {
    public static void main(String[] args) {
        Queue<String> qP = new PriorityQueue<String>(Collections.reverseOrder());

        qP.offer("B");
        qP.offer("C");
        qP.offer("A");

        System.out.println(qP);

        String popValue = qP.poll();

        System.out.println(qP);
        System.out.println(popValue);
    }
}
