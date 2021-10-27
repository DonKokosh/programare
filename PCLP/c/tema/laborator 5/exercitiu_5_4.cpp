#include <stdio.h>
#include <iostream>
#include <cmath>
#include <conio.h>
using namespace std;

int main ()
{
    int a, b, ope, sum, dif, div, imp, inm;
    cout << "introduceti prima variabila a = ";
    cin >> a;
    cout << "introduceti a doua variabila b = ";
    cin >> b;
    cout << "introduceti unul din cei cinci operatori matematici '+, -, *, /, %' notati de la 1 pana la 5 = ";
    cin >> ope;
    if (ope == 1)
    {
        printf("\nAti ales adunare", ope);
        sum=a+b;
        printf("\na + b = %d", sum);
    }
    else 
    {
        if (ope == 2)
        {
            printf("\nAti ales scadere", ope);
            dif=a-b;
            printf("\na - b = %d", dif);
        }
        else
        {
            if (ope == 3)
            {
                printf("\nAti ales inmultire", ope);
                inm=a*b;
                printf("\na * b = %d", inm);
            }
            else
            {
                if (ope == 4)
                {
                    printf("\nAti ales impartire", ope);
                    imp=a/b;
                    printf("\na / b = %d", imp);
                }
                else
                {
                    if (ope == 5)
                    {
                        printf("\nAti ales diviziune", ope);
                        div=a%b;
                        printf("\na % b = %d", div);
                    }
                }
            }
        }
        
    }
    return 0;
}