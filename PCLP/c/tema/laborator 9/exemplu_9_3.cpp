#include<conio.h>
#include <stdio.h>
int main()
{ 
    int n, m; 
    int * mat; 
    int i, j; 
    printf("\nNumarul de linii:");
    scanf("%d", &n);
    printf("\nNumarul de coloane:");
    scanf("%d", &m);
    mat=new int[n*m];
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
        { 
            printf("mat[%d][%d]=",i,j);
            scanf("%d", &mat[i*m+j]);
        }
    for(i=0 ; i<n ; i++)
    { 
        printf("\n");
        for(j=0;j<m;j++)
            printf("%5d",mat[i*m+j]);
    }
    printf("\nsizeof(*mat)=%d", sizeof(*mat)); 
    printf("\n*(mat+0*m)=%d",*(mat+0*m)); 
    if(n>1)
        printf("\n*(mat+1*m)=%d",*(mat+1*m));
    if(n>2)
        printf("\n*(mat+2*m)=%d",*(mat+2*m)); 
    delete [ ]mat;
}