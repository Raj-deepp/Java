import java.util.Scanner;

class Process {
    int processID;
    int arrivalTime;
    int burstTime;
}

public class FCFS {
    public static void findWaitingTime(Process processes[], int n, int waitingTime[]) {
        waitingTime[0] = 0;
        for (int i = 1; i < n; i++) {
            waitingTime[i] = processes[i - 1].burstTime + waitingTime[i - 1];
        }
    }

    public static void findTurnaroundTime(Process processes[], int n, int waitingTime[], int turnaroundTime[]) {
        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = processes[i].burstTime + waitingTime[i] - processes[i].arrivalTime;
        }
    }

    public static void findAvgTime(Process processes[], int n) {
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];
        int totalWaitingTime = 0, totalTurnaroundTime = 0;

        findWaitingTime(processes, n, waitingTime);
        findTurnaroundTime(processes, n, waitingTime, turnaroundTime);

        System.out.println("Processes\tArrival time\tBurst time\tWaiting time\tTurnaround time");
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnaroundTime[i];
            System.out.println(processes[i].processID + "\t\t" + processes[i].arrivalTime + "\t\t" + processes[i].burstTime + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }

        float avgWaitingTime = (float) totalWaitingTime / n;
        float avgTurnaroundTime = (float) totalTurnaroundTime / n;
        System.out.println("Average waiting time = " + String.format("%.2f", avgWaitingTime));
        System.out.println("Average turnaround time = " + String.format("%.2f", avgTurnaroundTime));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {
            processes[i] = new Process();
            System.out.print("Enter arrival time for process " + (i + 1) + ": ");
            processes[i].arrivalTime = scanner.nextInt();
            System.out.print("Enter burst time for process " + (i + 1) + ": ");
            processes[i].burstTime = scanner.nextInt();
            processes[i].processID = i + 1;
        }

        findAvgTime(processes, n);
        scanner.close();
    }
}
