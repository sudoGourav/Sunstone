//Write a C program that asks the gender and salary of an employee, and calculates their tax using separate functions for males and females.
#include <stdio.h>

// Function to calculate tax for male employees
float calculateMaleTax(float salary) {
    if (salary <= 30000) {
        return salary * 0.10; // 10% tax
    } else {
        return salary * 0.15; // 15% tax
    }
}

// Function to calculate tax for female employees
float calculateFemaleTax(float salary) {
    if (salary <= 30000) {
        return salary * 0.08; // 8% tax
    } else {
        return salary * 0.12; // 12% tax
    }
}

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
        tax = calculateMaleTax(salary);
    } else if (gender == 'F' || gender == 'f') {
        tax = calculateFemaleTax(salary);
    } else {
        printf("Invalid gender entered.\n");
        return 1; // Exit with error
    }

    // Output the calculated tax
    printf("The tax for the employee is: %.2f\n", tax);

    return 0;
}
