#include <stdio.h>
#include <conio.h>

#define PI 3.1415

float aria(float);
float lungime(float);

int r = 5;

int main()

{
    float raza, a, l;

    printf("\nIntroduceti valoarea razei: ");
    scanf("%f", &raza);

    a = aria(raza);
    l = lungime(raza);


    printf("\nCercul are: ");
    printf("\nraza = %f" , raza);
    printf("\naria = %f" , a);
    printf("\nlungimea = %f" , l);


    printf("\nCercul are: ");
    printf("\nraza = %f" , r);
    printf("\naria = %f" , aria(r));
    printf("\nlungimea = %f" , lungime(r));
    getch();
}

float aria(float r)
{
    float a;
    a = PI * r * r;
    return a;
}

float lungime(float r)
{
    float l;
    l = 2 * PI * r;
    return l;
}