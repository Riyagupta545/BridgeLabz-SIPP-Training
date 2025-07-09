package LinkedLists;
class Task {
    int id;
    String name, due;
    int priority;
    Task next;

    Task(int id, String name, int priority, String due) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.due = due;
        this.next = null;
    }
}

public class TaskScheduler {
    Task head = null;

    // Add at end
    void addTask(int id, String name, int priority, String due) {
        Task newTask = new Task(id, name, priority, due);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Delete by ID
    void deleteTask(int id) {
        if (head == null) return;
        Task curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (prev != null) prev.next = curr.next;
                else {
                    Task last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // View all tasks
    void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("ID: " + temp.id + ", " + temp.name + ", Priority: " + temp.priority + ", Due: " + temp.due);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority)
                System.out.println("Found: " + temp.name + " (ID: " + temp.id + ")");
            temp = temp.next;
        } while (temp != head);
    }

    // Round-Robin simulation (time quantum 1 unit)
    void simulateRoundRobin(int rounds) {
        if (head == null) return;
        Task temp = head;
        System.out.println("Round-Robin Execution:");
        for (int i = 0; i < rounds; i++) {
            System.out.println("Executing: " + temp.name + " (ID: " + temp.id + ")");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Email Reply", 2, "2025-07-05");
        ts.addTask(2, "Report Submission", 1, "2025-07-06");
        ts.addTask(3, "Code Review", 3, "2025-07-07");

        ts.displayTasks();
        ts.simulateRoundRobin(5);
        ts.searchByPriority(2);
        ts.deleteTask(2);
        System.out.println("After Deletion:");
        ts.displayTasks();
    }
}
