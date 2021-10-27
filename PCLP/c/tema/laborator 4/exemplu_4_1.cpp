#include <stdio.h>
#include <conio.h>
int main()
{
    int a, b;
    printf("a=");
    scanf("%d", &a);
    printf("b=");
    scanf("%d", &b);
    printf("\n%d + %d = %d", a, b, a+b);
    printf("\n%d - %d = %d", a, b, a-b); 
    printf("\n%d * %d = %d", a, b, a*b);
    printf("\n%d / %d = %d", a, b, a/b);
    printf("\n%d %% %d = %d", a, b, a%b);
    getch();
    b=++a;
    printf("\nIncrementare (operatorul prefixat): a=%d, b=%d", a, b);
    b=a++;
    printf("\nIncrementare (operatorul postfixat): a=%d, b=%d", a, b);
    getch();
    printf("\n%d << 3 = %d", a, a<<3);
    printf("\n%d >> 3 = %d", a, a>>3);
    getch();
} 
