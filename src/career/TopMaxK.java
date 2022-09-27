package career;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/9/27 19:20
 */
public class TopMaxK {
    static PriorityQueue<Integer> queue;
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 2, 6};
        int N = 3;
        queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int num : arr) {
            if (queue.size() < N) queue.offer(num);
            else if (queue.size() == N && queue.peek() < num) {
                queue.poll();
                queue.offer(num);
            }
        }
        System.out.println(queue);
    }
}
