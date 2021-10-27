#include <conio.h>
#include <iostream>
using namespace std;


int main()
{
    int userNumber;
    long factorial = 1;

    cout<<"Introduceti numarul care se va calcula factorial:"<<endl;
    cin>>userNumber;
    if (userNumber == 0 )
    {
        printf("Program Terminated");
        exit (0);
    }    
    else
    {    
        for(int i=1; i<=userNumber; i++)
        {
        factorial *= i;
        cout << factorial << "\n"; 
        }
    }
    cout<<"Numarul "<<userNumber<< " are factorialul: "<<factorial<<endl;
    return 0;
}