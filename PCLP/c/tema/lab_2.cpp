#include <stdlib.h>
#include <conio.h>
#include <stdio.h>


int main()
{
    int b = 8 ;
    char caracter;
    char sir [30];

    int zi, luna, an;

    printf("Introduceti data nasteri (zz-ll-aa): ");
    scanf("\n%d-%d-%d", &zi, &luna, &an);
    printf("\nData: %d.%d.%d", zi, luna, an);

    gets(sir);

    puts(sir);

    scanf ("%s", sir);

    printf("sirul meu este:  %s", sir);

    caracter = getch();

    putch(caracter);

    putch('\n');

    caracter = getchar();

    putchar(caracter);

    return 0;
}
