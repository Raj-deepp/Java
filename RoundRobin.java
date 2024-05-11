import java.util.Scanner;

class ProcessRR {
    int processID;
    int burstTime;
}

public class RoundRobin {
    public static void roundRobin(ProcessRR processes[], int n, int quantum) {
        int[] remainingTime = new int[n];
        for (int i = 0; i < n; i++) {
            remainingTime[i] = processes[i].burstTime;
        }

        int currentTime = 0;
        int completed = 0;

        while (completed < n) {
            for (int i = 0; i < n; i++) {
                if (remainingTime[i] > 0) {
                    int executeTime = Math.min(remainingTime[i], quantum);
                    remainingTime[i] -= executeTime;
                    currentTime += executeTime;

                    System.out.println("P" + processes[i].processID + " executes for " + executeTime + " units. Remaining time: " + remainingTime[i]);

                    if (remainingTime[i] == 0) {
                        completed++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        ProcessRR[] processes = new ProcessRR[n];
        for (int i = 0; i < n; i++) {
            processes[i] = new ProcessRR();
            System.out.print("Enter burst time for process P" + (i + 1) + ": ");
            processes[i].burstTime = scanner.nextInt();
            processes[i].processID = i + 1;
        }

        System.out.print("Enter the time quantum: ");
        int quantum = scanner.nextInt();

        roundRobin(processes, n, quantum);
        scanner.close();
    }
}
