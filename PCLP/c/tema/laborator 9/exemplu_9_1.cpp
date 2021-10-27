#include<stdio.h>
#include<conio.h>
#include<malloc.h>
int main()
{
    int i, dim;
    double *p;
    printf("\nIntroduceŃi dimensiunea blocurilor: ");
    scanf("%d", &dim);
    for(i=1; ;i++)
    { 
        p=(double *)malloc(dim*sizeof(double));
        if( p != NULL)
            printf("\nS-a alocat blocul nr. %d la adresa %u", i, p);
        else
        { 
            printf("\nAlocare imposibila - memorie insuficienta ");
            break;
        }
    }
}