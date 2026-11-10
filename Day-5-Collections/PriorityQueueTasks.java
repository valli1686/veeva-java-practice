import java.util.*;

class Task {
    int id;
    int priority;

    Task(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class PriorityQueueTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Task> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.priority != b.priority) {
                    return b.priority - a.priority;
                }
                return a.id - b.id;
            }
        );

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int priority = sc.nextInt();

            pq.add(new Task(id, priority));
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll().id + " ");
        }
    }
}