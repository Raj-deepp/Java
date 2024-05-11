#include <bits/stdc++.h>

#define NUMBER_OF_CUSTOMERS 5
#define NUMBER_OF_RESOURCES 3

int available[NUMBER_OF_RESOURCES];
int maximum[NUMBER_OF_CUSTOMERS][NUMBER_OF_RESOURCES];
int allocation[NUMBER_OF_CUSTOMERS][NUMBER_OF_RESOURCES];
int need[NUMBER_OF_CUSTOMERS][NUMBER_OF_RESOURCES];

int request_resources(int customer_num, int request[]);
int release_resources(int customer_num, int release[]);
int is_safe_state();

int main() {
    // Initialize available, maximum, allocation, and need matrices

    // Request some resources (this part is just for demonstration, you can customize it)
    int customer_num = 0; // Customer number who requests resources
    int request[NUMBER_OF_RESOURCES] = {1, 0, 2}; // Resource request array

    // Release some resources (this part is just for demonstration, you can customize it)
    int release[NUMBER_OF_RESOURCES] = {0, 0, 2}; // Resource release array

    // Check if the request can be granted
    if (request_resources(customer_num, request)) {
        printf("Request granted.\n");
        // Proceed with the allocation if request is granted
        // Process the allocated resources
    } else {
        printf("Request denied.\n");
        // Handle the denied request
    }

    // Check if the release can be processed
    if (release_resources(customer_num, release)) {
        printf("Resources released successfully.\n");
        // Proceed with the deallocation if release is successful
        // Update the allocation matrix
    } else {
        printf("Unable to release resources.\n");
        // Handle the unable to release case
    }

    // Check if the system is in a safe state
    if (is_safe_state()) {
        printf("System is in a safe state.\n");
        // Proceed with safe state operations
    } else {
        printf("System is not in a safe state.\n");
        // Handle unsafe state
    }

    return 0;
}

int request_resources(int customer_num, int request[]) {
    // Check if request is within bounds
    for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
        if (request[i] > available[i] || request[i] > need[customer_num][i]) {
            return 0;
        }
    }

    // Try allocating resources temporarily
    for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
        available[i] -= request[i];
        allocation[customer_num][i] += request[i];
        need[customer_num][i] -= request[i];
    }

    // Check if system is still in safe state after allocation
    if (!is_safe_state()) {
        // Roll back allocation
        for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
            available[i] += request[i];
            allocation[customer_num][i] -= request[i];
            need[customer_num][i] += request[i];
        }
        return 0;
    }

    return 1;
}

int release_resources(int customer_num, int release[]) {
    // Check if release is within bounds
    for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
        if (release[i] > allocation[customer_num][i]) {
            return 0;
        }
    }

    // Release resources
    for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
        available[i] += release[i];
        allocation[customer_num][i] -= release[i];
        need[customer_num][i] += release[i];
    }

    return 1;
}

int is_safe_state() {
    int work[NUMBER_OF_RESOURCES];
    int finish[NUMBER_OF_CUSTOMERS] = {0};

    // Initialize work matrix
    for (int i = 0; i < NUMBER_OF_RESOURCES; i++) {
        work[i] = available[i];
    }

    // Find an index i such that both Finish[i] == 0 and Need[i] <= Work
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
                finish[i] = 1;
                i = -1; // Start from the beginning again
            }
        }
    }

    // If all processes finish, return true
    for (int i = 0; i < NUMBER_OF_CUSTOMERS; i++) {
        if (!finish[i]) {
            return 0;
        }
    }

    return 1;
}
