#include <stdio.h>
#include <conio.h>
int main()
{
    int g, m, s;
    printf("grade:");
    scanf("%d", &g); 
    printf("minute =");
    scanf("%d", &m);
    printf("secunde =");
    scanf("%d", &s);
    m += s/60;
    s=s%60;
    g += m/60;
    m = m%60;
    g = g%360;
    printf("\nUnghiul este: %d grd. %d min %d sec.", g, m, s);
    getch();
}