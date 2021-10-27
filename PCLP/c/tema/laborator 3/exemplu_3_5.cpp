#include <stdio.h>
#include <conio.h>
int main()
{
    float a, b;
    printf("\nIntrodu un real:");
    scanf("%f", &a);
    printf("\na=%f, a=%e, a=%g", a, a, a);
    printf("\n*%12f*", a);
    printf("\n*%.2f*", a);
    printf("\n*%12.2f*", a);
    printf("\n*%+12.2f*", a);
    getch();
} 