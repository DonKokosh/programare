#include<conio.h>
#include<stdio.h>
#include<malloc.h>
int main()
{ 
    float tab[10]; 
    float *p, aux;
    int i, dim;
    for(i=0;i<10;i++)
    { 
        printf("\n tab[%d]=", i);
        scanf("%f", &tab[i]);
    }
    for(i=0;i<10;i++)
        printf("\n tab[%d]=%f", i , tab[i]);
    printf("\nIntroduceti dimensiunea tabloului:");
    scanf("%d", &dim);
    p=(float*)malloc(dim*sizeof(float));
    for(i=0 ; i<dim ; i++)
    { 
        printf("\np[%d] = ", i);
        scanf("%f", &aux);
        *(p+i)=aux;
    }
    for(i=0;i<dim;i++)
        printf("\n tab[%d] = %f", i, *(p+i));
    free(p);
    printf("\nIntroduceti dimensiunea tabloului care se realocă:");
    scanf("%d", &dim);
    p=(float*)malloc(dim*sizeof(float));
    for(i=0;i<dim;i++)
    { 
        printf("\np[%d]=",i);
        scanf("%f", p+i);
    }
    for(i=0;i<dim;i++)
        printf("\n tab[%d]=%f", i ,*(p+i));
    free(p);
    getch();
}