//Write a C program that asks the gender and salary of an employee, and calculates their tax based on their gender.
#include <stdio.h>

int main() {
    char gender;
    float salary, tax;

    // Input gender
    printf("Enter the gender of the employee (M/F): ");
    scanf(" %c", &gender);

    // Input salary
    printf("Enter the salary of the employee: ");
    scanf("%f", &salary);

    // Calculate tax based on gender
    if (gender == 'M' || gender == 'm') {
        // Tax rate for male employees
        if (salary <= 30000) {
            tax = salary * 0.10; // 10% tax
        } else {
            tax = salary * 0.15; // 15% tax
        }
    } else if (gender == 'F' || gender == 'f') {
        // Tax rate for female employees
        if (salary <= 30000) {
            tax = salary * 0.08; // 8% tax
        } else {
            tax = salary * 0.12; // 12% tax
        }
    } else {
        printf("Invalid gender entered.\n");
        return 1; // Exit with error
    }

    // Output the calculated tax
    printf("The tax for the employee is: %.2f\n", tax);

    return 0;
}
