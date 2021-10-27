#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
using namespace std;

int main()
{
    int *t_1, *t_2, *t_3, dim;
    printf("setati ce dimensiune sa aibe vectorii:");
    scanf("%d",&dim);
    t_1 =(int *)malloc(dim*sizeof(int));//alocare dinamica
    printf("\n\rintroduceti valorile primului vector: ");
    for(int i=0; i<dim; i++)
    {
        printf("\n\rt_1[%d]",i);
        scanf("%d",t_1+i);
    }
    t_2 =(int *)malloc(dim*sizeof(int)); //alocare dinamica
    printf("\n\rIntroduceti datele celui deal doilea vector:");
    for(int i =0; i<dim; i++)
    {
            printf("\n\rt_2[%d]",i);
            scanf("%d",t_2+i);
    }
    t_3 =(int *)malloc(dim*sizeof(int));//alocdare dinamica
    for (int i=0; i<dim; i++)
    {
        *(t_3+ i) = *(t_1+ i) + *(t_2+i);
    }
    printf("\n\rApasati tastar enter pentru a calcula cei 2 vectori.:");
    getch();

    for (int i =0; i<dim; i++)
    {
        printf("\n\rvctor1[%d] + vector[%d] = %d",i,i, *(t_3+i));
    }
}

