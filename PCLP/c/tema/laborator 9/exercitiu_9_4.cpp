#include <iostream>

using namespace std;

int main()
{
    int **matrice, a, b, c;
    printf("introduceti dimensiunea matricei :");
    scanf("%d",&c);

    int m=c;

    matrice = new int*[c];
    for(a=0; a<c; a++)
    {
        matrice[a] = new int[m];
    }
    printf("\n\rintroduceti valori");
    for(a=0; a<c; a++)
    {
        for(b=0; b<m; b++)
        {
                printf("\n\rmatrice[%d][%d]",a,b);
            scanf("%d",&matrice[a][b]);
        }
    }
    printf("\n\rafisare diagonala principala:");
    for(a=0; a<c; a++)
    {
        for(b=0; b<m; b++)
        {
            if(matrice[a][b]==matrice[b][a])
            {
                printf("\n\rmatrice[%d][%d]=%d",a,b,matrice[a][b]);

            }

        }
    }
    printf("\n\rAfisare diagonala secundara:");
    for(a=0; a<c; a++)
    {
        for(b=0; b<m; b++)
        {
            if(a+b ==c-1)
            {
              printf("\n\rmatrice[%d][%d]=%d",a,b,matrice[a][b]);
            }

        }
    }



    return 0;
}
