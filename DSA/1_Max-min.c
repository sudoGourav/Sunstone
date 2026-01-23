#include <stdio.h>

int main() {
    int size;

    // Input size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

    // Input array elements
    printf("Enter %d elements of the array: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    // Initialize max and min with the first element
    int max = arr[0];
    int min = arr[0];

    // Find maximum and minimum in the array
    for (int i = 1; i < size; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    // Output the results
    printf("Maximum number: %d\n", max);
    printf("Minimum number: %d\n", min);

    return 0;
}
