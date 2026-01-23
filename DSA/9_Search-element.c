//Write a C program to search for an element in an array of 10 elements using pointers. If the element is found, display "Found", otherwise display "Not Found."
#include <stdio.h>

int main() {
    int arr[10], *ptr, searchElement;
    int found = 0;  // Flag to indicate if the element is found

    // Input 10 elements into the array
    printf("Enter 10 elements of the array:\n");
    for (int i = 0; i < 10; i++) {
        scanf("%d", &arr[i]);
    }

    // Input the element to search for
    printf("Enter the element to search: ");
    scanf("%d", &searchElement);

    // Initialize pointer to the start of the array
    ptr = arr;

    // Search for the element using the pointer
    for (int i = 0; i < 10; i++) {
        if (*(ptr + i) == searchElement) {
            found = 1;  // Set flag to indicate the element is found
            break;      // Exit the loop if found
        }
    }

    // Output the result
    if (found) {
        printf("Found\n");
    } else {
        printf("Not Found\n");
    }

    return 0;
}
