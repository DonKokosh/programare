#include<stdio.h>
#include <conio.h>
void main(void)
{
    int nr1, nr2, i, min, cmmdc, cmmmc;
    do
    {
        printf("nr1=");
        scanf("%d",&nr1);
    }
    while (nr1<=1); //se citesc valori >1
    do
    {
        printf("nr2=");
        scanf("%d",&nr2);
    }
    while (nr2<=1); //se citesc valori >1
        printf("\nDivizorii numarului %d sunt:\n", nr1);
    for(i=2 ; i<=nr1 ; i++)
        if (!(nr1 % i))
            printf("%d ", i);
    printf("\nDivizorii numarului %d sunt:\n", nr2);
    for(i=2 ; i <= nr2 ; i++)
        if (!(nr2%i))
            printf("%d ", i);
            min=nr1<nr2 ? nr1 : nr2; // se determina minimul dintre nr1 si nr2
    // se determina c.m.m.d.c.
    for( i=2, cmmdc=1; i<=min ;i++)
        if(!(nr1%i)&&!(nr2%i))
            cmmdc = i;
    // se determina c.m.m.m.c.
    cmmmc = nr1*nr2/cmmdc;
    printf("\ncmmdc = %d", cmmdc );
    printf("\ncmmmc=%d\n",cmmmc );
    getch();
} 