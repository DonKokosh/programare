#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b;
    printf("introduceti un interval:");
    printf("\n\rmin:");
    scanf("%d",&a);
    printf("\n\rMax:");
    scanf("%d",&b);
    numar_prim(a,b);

}
int numar_prim( int minim, int maxim)
{

    for(int d=minim; d<=maxim; d++)
    {
        int nr= 0;
        for(int c=2; c<=d/2; c++)
        {
            if (d%c==0)
            {
                nr++;
            }
        }
        if(nr==0)
        {
            printf("\n\rNumarul %d este prim",d);
        }
        else
        {
            printf("\n\rNumarul %d nu este prim",d);
        }
    }
}

