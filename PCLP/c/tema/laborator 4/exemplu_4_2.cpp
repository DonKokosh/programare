#include <stdio.h>
#include <conio.h>
int main()
{
    int a, b;
    printf("a = ");
    scanf("%d", &a);
    printf("b = ");
    scanf("%d", &b);
    printf("\n ~ %d = %d", a, ~a);
    printf("\n%d & %d = %d", a, b, a&b);
    printf("\n%d | %d = %d", a, b, a|b);
    printf("\n%d ^ %d = %d", a, b, a^b);
    getch();
} 
