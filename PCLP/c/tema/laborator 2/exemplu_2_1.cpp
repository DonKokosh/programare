#include <stdio.h>
#include <conio.h>

int main()

{
    int a=10, b=20;

    printf("\na = %d, &a = %u, sizeof(a) = %d" ,a, &a, sizeof(a));
    printf("\nb = %d, &b = %u, sizeof(b) = %d" ,b, &b, sizeof(b));
    getch();
}