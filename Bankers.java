import java.util.Arrays;

public class BankersAlgorithm {
    static final int NUMBER_OF_CUSTOMERS = 5;
    static final int NUMBER_OF_RESOURCES = 3;

    static int[] available = new int[NUMBER_OF_RESOURCES];
    static int[][] maximum = new int[NUMBER_OF_CUSTOMERS][NUMBER_OF_RESOURCES];
    static int[][] allocation = new int[NUMBER_OF_CUSTOMERS][NUMBER_OF_RESOURCES];
    static int[][] need = new int[NUMBER_OF_CUSTOMERS][NUMBER_OF_RESOURCES];

    public static void main(String[] args) {
        // Initialize available, maximum, allocation, and need matrices
        initialize();

        // Request some resources
        int customerNum = 0; // Customer number who requests resources
        int[] request = {1, 0, 2}; // Resource request array

        // Release some resources
        int[] release = {0, 0, 2}; // Resource release array

        // Check if the request can be granted
        if (requestResources(customerNum, request)) {
            System.out.println("Request granted.");
            // Proceed with the allocation if request is granted
            // Process the allocated resources
        } else {
            System.out.println("Request denied.");
            // Handle the denied request
        }

        // Check if the release can be processed
        if (releaseResources(customerNum, release)) {
            System.out.println("Resources released successfully.");
            // Proceed with the deallocation if release is successful
            // Update the allocation matrix
        } else {
            System.out.println("Unable to release resources.");
            // Handle the unable to release case
        }

        // Check if the system is in a safe state
        if (isSafeState()) {
            System.out.println("System is in a safe state.");
            // Proceed with safe state operations
        } else {
            System.out.println("System is not in a safe state.");
            // Handle unsafe state
        }
    }

    static void initialize() {
        // Initialize available matrix
        available[0] = 3;
        available[1] = 3;
        available[2] = 2;

        // Initialize maximum matrix
        maximum[0] = new int[]{7, 5, 3};
        maximum[1] = new int[]{3, 2, 2};
        maximum[2] = new int[]{9, 0, 2};
        maximum[3] = new int[]{2, 2, 2};
        maximum[4] = new int[]{4, 3, 3};

        // Initialize allocation and need matrices
        for (int i = 0; i < NUMBER_OF_CUSTOMERS; i++) {
            for (int j = 0; j < NUMBER_OF_RESOURCES; j++) {
                allocation[i][j] = 0;
                need[i][j] = maximum[i][j];
            }
        }
    }

    static boolean requestResources(int customerNum, int[] request) {
        // Check if request is within bounds
        for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
            if (request[i] > available[i] || request[i] > need[customerNum][i]) {
                return false;
            }
        }

        // Try allocating resources temporarily
        for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
            available[i] -= request[i];
            allocation[customerNum][i] += request[i];
            need[customerNum][i] -= request[i];
        }

        // Check if system is still in safe state after allocation
        if (!isSafeState()) {
            // Roll back allocation
            for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
                available[i] += request[i];
                allocation[customerNum][i] -= request[i];
                need[customerNum][i] += request[i];
            }
            return false;
        }

        return true;
    }

    static boolean releaseResources(int customerNum, int[] release) {
        // Check if release is within bounds
        for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
            if (release[i] > allocation[customerNum][i]) {
                return false;
            }
        }

        // Release resources
        for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
            available[i] += release[i];
            allocation[customerNum][i] -= release[i];
            need[customerNum][i] += release[i];
        }

        return true;
    }

    static boolean isSafeState() {
        int[] work = Arrays.copyOf(available, NUMBER_OF_RESOURCES);
        boolean[] finish = new boolean[NUMBER_OF_CUSTOMERS];

        // Find an index i such that both Finish[i] == false and Need[i] <= Work
        for (int i = 0; i < NUMBER_OF_CUSTOMERS; i++) {
            if (!finish[i]) {
                int j;
                for (j = 0; j < NUMBER_OF_RESOURCES; j++) {
                    if (need[i][j] > work[j]) {
                        break;
                    }
                }
                if (j == NUMBER_OF_RESOURCES) {
                    // Resource allocation is possible for process i
                    for (int k = 0; k < NUMBER_OF_RESOURCES; k++) {
                        work[k] += allocation[i][k];
                    }
                    finish[i] = true;
                    i = -1; // Start from the beginning again
                }
            }
        }

        // If all processes finish, return true
        for (boolean b : finish) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}