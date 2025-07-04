package LinkedLists;
class Process {
    int pid, burst, priority;
    Process next;

    Process(int pid, int burst, int priority) {
        this.pid = pid;
        this.burst = burst;
        this.priority = priority;
    }
}

public class RoundRobin {
    Process head = null;

    // Add process at end
    void addProcess(int pid, int burst, int priority) {
        Process p = new Process(pid, burst, priority);
        if (head == null) {
            head = p;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    // Delete process by PID
    void deleteProcess(int pid) {
        if (head == null) return;
        Process curr = head, prev = null;
        do {
            if (curr.pid == pid) {
                if (prev != null) prev.next = curr.next;
                else {
                    Process last = head;
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

    // Simulate Round Robin
    void roundRobin(int quantum) {
        if (head == null) return;
        Process temp = head;
        int totalTime = 0, completed = 0, count = 0;
        do { count++; temp = temp.next; } while (temp != head);

        int[] waiting = new int[count];
        int[] turnaround = new int[count];
        temp = head;

        System.out.println("Round Robin Execution:");
        while (completed < count) {
            if (temp.burst > 0) {
                int exec = Math.min(temp.burst, quantum);
                temp.burst -= exec;
                totalTime += exec;
                if (temp.burst == 0) {
                    turnaround[temp.pid - 1] = totalTime;
                    waiting[temp.pid - 1] = turnaround[temp.pid - 1] - exec;
                    completed++;
                }
                System.out.println("Process " + temp.pid + " executed for " + exec);
            }
            temp = temp.next;
        }

        double avgW = 0, avgT = 0;
        for (int i = 0; i < count; i++) {
            avgW += waiting[i];
            avgT += turnaround[i];
        }
        System.out.println("Average Waiting Time: " + avgW / count);
        System.out.println("Average Turnaround Time: " + avgT / count);
    }

    public static void main(String[] args) {
        RoundRobin rr = new RoundRobin();
        rr.addProcess(1, 5, 1);
        rr.addProcess(2, 3, 2);
        rr.addProcess(3, 7, 1);
        rr.roundRobin(2);
    }
}

