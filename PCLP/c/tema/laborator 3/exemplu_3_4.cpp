#include <stdio.h>
#include <conio.h>
int main()
{
    int a, b;
    printf("\nIntrodu un intreg:");
    scanf("%d", &a);
    printf("\na=%d, a=%o, a=%x, a=%u, a=%c", a, a, a, a, a);
    getch();
    printf("\nIntrodu 2 intregi:");
    scanf("%d%d", &a, &b);
    printf("\na=%d, a=%o, a=%x, a=%u, a=%c", a, a, a, a, a);
    printf("\nb=%d, b=%o, b=%x, b=%u, b=%c", b, b, b, b, b);
    getch();
    printf("\nIntrodu 2 intregi:");
    scanf("%2d%2d",&a,&b);
    printf("\na=%d, a=%o, a=%x, a=%u, a=%c", a, a, a, a, a);
    printf("\nb=%d, b=%o, b=%x, b=%u, b=%c", b, b, b, b, b);
    getch();
    printf("\n*%+6d*",1);
    printf("\n*%+6d*",12);
    printf("\n*%+6d*",123);
    printf("\n*%+6d*",1234);
    printf("\n*%+6d*",12345);
    getch();
}

