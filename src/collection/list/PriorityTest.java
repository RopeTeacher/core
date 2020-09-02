package collection.list;

import java.util.PriorityQueue;

public class PriorityTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(0);
        pq.add(-1);
        Integer peek = pq.peek();
        System.out.println(peek);
    }
}
