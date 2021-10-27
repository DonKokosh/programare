#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *a;
    int dimension;

    printf("introduceti dimensiunea vectorului :");
    scanf("%d",&dimension);
    a=(int *)malloc(dimension*sizeof(int));
    for(int i =0; i<dimension; i++)
    {
        printf("\n\rtab[%d]:",i);
        scanf("%d",a+i);

    }
    printf("\n\rAfisare tablou alocat dinamic:");
    for(int i =0; i<dimension; i++)
    {
            if(*(a+i) <0)
            {
                *(a+i) = 0;
            }
        printf("\n\rtab[%d] = %d", i, *(a+i));

    }



    return 0;
}

