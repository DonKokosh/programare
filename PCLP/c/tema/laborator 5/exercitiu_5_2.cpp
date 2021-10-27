#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <cmath>
using namespace std;

int main ()
{
    float a, b, c, arie;
    printf("\nIntrodu un numar:");
    scanf("%f", &a);
    printf("\nIntrodu un al doilea numar:");
    scanf("%f", &b);
    printf("\nIntrodu un al treilea numar:");
    scanf("%f", &c);
    
    if (b==hypot(a, c))
    {
        printf("\na, b ,c sunt laturile unui triunghi dreptunghic");
        arie=(a*c)/2;
        printf("\naria triunghiului este = %.2f", arie);
    }
    else
    {
       printf("a, b , c nu sunt laturi de tringhi"); 
    }
return 0;
    
}