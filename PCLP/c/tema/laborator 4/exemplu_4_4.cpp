#include <stdio.h>
#include <conio.h>
int main()
{
    int a, b, c, max;
    printf("a=");
    scanf("%d", &a);
    printf("b=");
    scanf("%d", &b);
    printf("c=");
    scanf("%d", &c);
    max = a>b ? a : b;
    max = max>c ? max : c;
    printf("\n Maximul dintre %d, %d, %d este: %d", a, b, c, max);
    /*varianta 2
    max = a>b && a>c ? a : b>c ? b : c ;
    printf("\n Maximul dintre %d, %d, %d este: %d", a, b, c, max);
    getch();*/
} 
