#include <stdio.h>

int main() {
    int num, range;

    // Input the number and range for the multiplication table
    printf("Enter the number for multiplication table: ");
    scanf("%d", &num);

    printf("Enter the range for the table: ");
    scanf("%d", &range);

    // Generate the multiplication table
    printf("Multiplication Table of %d:\n", num);
    for (int i = 1; i <= range; i++) {
        printf("%d x %d = %d\n", num, i, num * i);
    }

    return 0;
}
