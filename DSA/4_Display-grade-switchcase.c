#include <stdio.h>

int main() {
    char grade;

    // Input grade
    printf("Enter your grade (A, B, C, D, F): ");
    scanf(" %c", &grade);

    // Display marks range using switch case
    switch (grade) {
        case 'A':
            printf("Marks range: 90 - 100\n");
            break;
        case 'B':
            printf("Marks range: 80 - 89\n");
            break;
        case 'C':
            printf("Marks range: 70 - 79\n");
            break;
        case 'D':
            printf("Marks range: 60 - 69\n");
            break;
        case 'F':
            printf("Marks range: Below 60\n");
            break;
        default:
            printf("Invalid grade entered.\n");
    }

    return 0;
}
