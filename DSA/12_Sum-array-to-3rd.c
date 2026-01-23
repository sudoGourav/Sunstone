//Write a program adding two arrays and sum to the third array.
#include <stdio.h>

int main() {
    int size;

    // Input size of the arrays
    printf("Enter the size of the arrays: ");
    scanf("%d", &size);

    int arr1[size], arr2[size], sum[size];

    // Input elements for the first array
    printf("Enter elements for the first array:\n");
    for (int i = 0; i < size; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr1[i]);
    }

    // Input elements for the second array
    printf("Enter elements for the second array:\n");
    for (int i = 0; i < size; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr2[i]);
    }

    // Add the two arrays and store the result in the sum array
    for (int i = 0; i < size; i++) {
        sum[i] = arr1[i] + arr2[i];
    }

    // Output the result
    printf("Sum of the two arrays:\n");
    for (int i = 0; i < size; i++) {
        printf("%d ", sum[i]);
        printf("\n");
    }
    printf("\n");

    return 0;
}
