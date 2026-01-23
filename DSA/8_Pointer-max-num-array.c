#include <stdio.h>

int main() {
    int arr[10];
    int *ptr;
    int max;

    // Input 10 elements into the array
    printf("Enter 10 elements of the array:\n");
    for (int i = 0; i < 10; i++) {
        scanf("%d", &arr[i]);
    }

    // Initialize pointer to the start of the array
    ptr = arr;

    // Assume the first element is the maximum
    max = *ptr;

    // Traverse the array using the pointer to find the maximum
    for (int i = 1; i < 10; i++) {
        if (*(ptr + i) > max) {
            max = *(ptr + i);
        }
    }

    // Output the result
    printf("The maximum value in the array is: %d\n", max);

    return 0;
}
