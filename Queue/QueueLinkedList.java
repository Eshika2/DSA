package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();

        q.offer("Kamal");
        q.offer("Nimal");
        q.offer("Wimal");

        System.out.println(q);

        String popValue = q.poll();

        System.out.println(q);
        System.out.println(popValue);
    }
}
