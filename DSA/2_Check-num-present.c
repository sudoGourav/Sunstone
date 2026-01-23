#include <stdio.h>

int main() {
    int size, searchNumber, found = 0;

    // Input size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

    // Input array elements
    printf("Enter %d elements of the array: ", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    // Input the number to search
    printf("Enter the number to search: ");
    scanf("%d", &searchNumber);

    // Search for the number in the array
    for (int i = 0; i < size; i++) {
        if (arr[i] == searchNumber) {
            found = 1;
            break;
        }
    }

    // Output the result
    if (found) {
        printf("The number %d is present in the array.\n", searchNumber);
    } else {
        printf("The number %d is not present in the array.\n", searchNumber);
    }

    return 0;
}
