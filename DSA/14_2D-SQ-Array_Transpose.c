//Create a 2D- Square Array and then create another transpose array.
#include <stdio.h>

int main() {
    int n;

    // Input the size of the square array
    printf("Enter the size of the square array (n x n): ");
    scanf("%d", &n);

    int arr[n][n], transpose[n][n];

    // Input elements for the square array
    printf("Enter elements for the square array:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("Element [%d][%d]: ", i, j);
            scanf("%d", &arr[i][j]);
        }
    }

    // Calculate the transpose of the square array
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            transpose[j][i] = arr[i][j];
        }
    }

    // Output the original array
    printf("Original Array:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    // Output the transpose array
    printf("Transpose Array:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d ", transpose[i][j]);
        }
        printf("\n");
    }

    return 0;
}
