#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int main()
{
    int a, b, r;
    cout << "introduceti a = ";
    cin >> a;
    cout << "introduceti b = ";
    cin >> b;
    for (int r = 0; a!=r; r=a/5 )
    {
        for (int r = 0; b!=r; r=b/5)
        {
            cout << r << "\n";
        }
    }
    return 0;

}