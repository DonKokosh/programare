#include <conio.h>
#include <stdio.h>
int main()
{
    int n, m;
    int ** mat;
    int i, j;
    printf("\nNumarul de linii:");
    scanf("%d", &n);
    printf("\nNumarul de coloane:");
    scanf("%d", &m);
    mat=new int*[n];
    for(i=0 ; i<n ; i++)
        mat[i]=new int[m];
    for(i=0 ; i<n ; i++)
        for(j=0 ; j<m ; j++)
        {   
            printf("mat[%d][%d] = ", i, j);
            scanf("%d", &mat[i][j]);
        }
    for(i=0 ; i<n ; i++)
    {
        printf("\n");
        for(j=0 ; j<m ; j++)
            printf("%5d", mat[i][j]);
    }
    printf("\nsizeof(*mat) = %d", sizeof(*mat)); 
    printf("\n**mat = %d", **mat);
        if(n>1)
            printf("\n**(mat+1) = %d", **(mat+1)); 
        if(n>2)
            printf("\n**(mat+2)=%d",**(mat+2)); 
    for(i=0; i<n ; i++) 
        delete [ ] mat[i];
    delete [ ] mat;
}