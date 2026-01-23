//Create two 2-D arrays and sum to third Array.
#include <stdio.h>

int main() {
    int rows, cols;

    // Input the number of rows and columns for the arrays
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    int arr1[rows][cols], arr2[rows][cols], sum[rows][cols];

    // Input elements for the first array
    printf("Enter elements for the first array:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("Element [%d][%d]: ", i, j);
            scanf("%d", &arr1[i][j]);
        }
    }

    // Input elements for the second array
    printf("Enter elements for the second array:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("Element [%d][%d]: ", i, j);
            scanf("%d", &arr2[i][j]);
        }
    }

    // Add the two arrays and store the result in the sum array
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sum[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

    // Output the result
    printf("Sum of the two arrays:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", sum[i][j]);
        }
        printf("\n");
    }

    return 0;
}
