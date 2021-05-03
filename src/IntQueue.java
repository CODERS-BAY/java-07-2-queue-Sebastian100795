import java.util.ArrayList;
import java.util.List;

public class IntQueue {
    private List<Integer> queue = new ArrayList<>();

    public void enqueue(int newElement) {
        queue.add(newElement);
    }

    public int size() {
        return queue.size();
    }


    public int dequeue() {
        if (queue.size() == 0) {
            throw new QueueTooSmallException();
        }
        int number = queue.get(0);
        queue.remove(0);
        return number;
    }

    public int[] dequeue(int n) {
        if (queue.size() == 0) {
            throw new QueueTooSmallException();
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = dequeue();
        }
        return numbers;
    }
}