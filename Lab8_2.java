import java.util.*;

public class Lab8_2 {
    private static final Object lock = new Object();
    static class MessageThread extends Thread {
        private List<String> messages;
        public MessageThread(String name, List<String> messages) {
            super(name);
            this.messages = messages;
        }

        public void run() {
            synchronized (lock) {
                for (String msg : messages) {
                    System.out.println(getName() + ": " + msg);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> messages = new ArrayList<>();
        System.out.println("Enter the messages for the threads (type 'end' to finish): ");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            messages.add(input);
        }
        Thread t1 = new MessageThread("Thread 2", new ArrayList<>(messages));
        Thread t2 = new MessageThread("Thread 1", new ArrayList<>(messages));
        t2.start();
        t1.start();
    }
}