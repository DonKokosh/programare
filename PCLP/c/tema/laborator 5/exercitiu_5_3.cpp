#include <stdio.h>
#include <conio.h>
#include <iostream>
using namespace std;

main ()
{
    int zi;
    int luna;
    int an;
    cout << "introduceti ziua: ";
    cin >> zi;
    cout << "introduceti luna: ";
    cin >> luna;
    cout << "introduceti anul: ";
    cin >> an;
    switch (luna)
    {
    case 1
        :printf("\nLuna %d este Ianuarie", luna);
        break;
    case 2
        :printf("\nLuna %d este Februarie", luna);
        break;
    case 3
        :printf("\nLuna %d este Martie", luna);
        break;    
    case 4
        :printf("\nLuna %d este Aprilie", luna);
        break;
    case 5
        :printf("\nLuna %d este Mai", luna);
        break;
    case 6
        :printf("\nLuna %d este Iunie", luna);
        break;
    case 7
        :printf("\nLuna %d este Iulie", luna);
        break;
    case 8
        :printf("\nLuna %d este August", luna);
        break;
    case 9
        :printf("\nLuna %d este Septembrie", luna);
        break;
    case 10
        :printf("\nLuna %d este Octombrie", luna);
        break;
    case 11
        :printf("\nLuna %d este Noiembrie", luna);
        break;
    case 12
        :printf("\nLuna %d este Decembrie", luna);
        break;    
    }
    return 0;
}