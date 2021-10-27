#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
using namespace std;

long x; //[1] [170];
long y; //[1] [170];
long factorial = 1;
int main()
{
    for(long i=1; i<=x; i++)
    {
        factorial *= i;
        for(long j=1; j<=y; j++)
        {
            factorial *= j;
        }
    }
    cout<<"Numarul x = "<<x<< " are factorialul: "<<factorial<<endl;
    cout<<"Numarul y = "<<y<< " are factorialul: "<<factorial<<endl;
    return 0;
}