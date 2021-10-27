#include <stdio.h>
#include <conio.h>


float aria(float);
float perimetru(float);
float lungime(float);
float latime(float);


int main()

{
    float L, a, l, p;

    printf("\nIntroduceti valoarea Lungimi: ");
    scanf("%f", &l);
    
    printf("\nIntroduceti valoarea Latimi: ");
    scanf("%f", &L);
    


    a = aria(a);
    p = perimetru(p);


    printf("\nDreptunchiul are: ");
    printf("\nlungime = %f" , l);
    printf("\nlatimea = %f" , L);
    printf("\naria = %f" , a);
    printf("\nperimetrul = %f" , p);

    getch();
}

float aria(float )
{
    float a, L , l;
    a = L * l;
    return a;
}

float perimetru(float )
{
    float p, L , l;
    p = 2 * (L + l);
    return p;
}