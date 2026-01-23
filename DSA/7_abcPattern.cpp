#include <iostream>
using namespace std;

int main() {
    int rows;

    // Input the number of rows
    cout << "Enter the number of rows: ";
    cin >> rows;

    // Print the alphabet pattern
    for (int i = 1; i <= rows; i++) {
        char ch = 'a';  // Start with 'a'
        for (int j = 1; j <= i; j++) {
            cout << ch << " ";
            ch++;  // Move to the next letter
        }
        cout << endl;  // Move to the next line after each row
    }

    return 0;
}
