#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#define max 3200
int a = 10;

void functie ()
{
    char caracter = getch();
    putch (caracter);
}
int main ()
{
    printf("salut!\n");
    printf("PCLPI\nAutomatica");
    printf("\nmax = %d", max);
    printf("\nValoarea lui a este %d", a);
    functie();

    return 0;
}
