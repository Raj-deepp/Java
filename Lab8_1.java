import java.util.Scanner;

public class Lab8_1 extends Thread {
    private final int lowerRange;
    private final int upperRange;

    public Lab8_1(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.print("Thread - " + getName() + "\nCounter - ");
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread " + getName() + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the thread: ");
        String threadName = scanner.nextLine();
        System.out.print("Enter the lower range of counter: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter the upper range of counter: ");
        int upperRange = scanner.nextInt();
        scanner.close();

        Lab8_1 thread = new Lab8_1(threadName, lowerRange, upperRange);
        thread.start();
    }
}