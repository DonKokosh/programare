#include <stdio.h>
#include <conio.h>
#include <math.h>
#include <stdlib.h>


int main()
{
    float a, b, c, delta, x1, x2;
    printf("coeficientul lui x^2:");
    if (scanf("%f", &a)!=1)
        {printf("Coeficientul lui x^2 este incorect!\n");
        getch();
        return (0); // se poate folosi si apelul functiei: exit(0);
    }
    printf("coeficientul lui x:");
    if (scanf("%f", &b)!=1)
    {
        printf("Coeficientul lui x este incorect!\n");
        getch();
        return (0); // exit(0);
    }
    printf("termenul liber:");
    if (scanf("%f", &c)!=1)
    {
        printf("Termenul liber este incorect!\n");
        getch();
        return (0); // exit(0);
    }
    if (a==0 && b==0 && c==0) 
    {
        printf("Ecuatie nedeterminata !\n");
        getch();
        return (0); // exit(0);
    }
    if (a==0 && b==0)
    {
        printf("Ecuatie imposibila !\n");
        getch();
        return (0); // exit(0);
    }
    if (a==0)
    {
        printf("Ecuatie de grad I");
        printf("\nSolutia este: x=%.2f\n", -c/b);
        getch();
        return (0); // exit(0);
    }
    delta= b*b - 4*a*c;
    if ( delta<0)
    {
        printf("radacini complexe\n");
        printf("x1= %.2f + i %.2f\n", -b/(2*a), sqrt(-delta)/(2*a));
        printf("x2= %.2f - i %.2f\n", -b/(2*a), sqrt(-delta)/(2*a));
        getch();
        return (0); // exit(0);
    }
    if ( delta==0 )
    {
        printf("Radacini reale si egale:\n");
        printf("x1=x2=%.2f\n", -b/(2*a));
        getch();
        return (0); // exit(0);
    }
    printf("Radacini reale si distincte:");
    printf("\nx1=%.2f\n", (-b+sqrt(delta))/(2*a));
    printf("\nx2=%.2f\n", (-b-sqrt(delta))/(2*a));
    getch();
} 