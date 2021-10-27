#include <iostream>

using namespace std;

int main()
{
    int n,m;
    printf("\n\rnumar de linii :");
    scanf("%d",&n);
    printf("\n\rnumar de coloane :");
    scanf("%d",&m);
    int **matrice_1, **matrice_2, **matrice_3;
    int a,b;
    matrice_1 =new int*[n];
    for(a=0; a<n; a++)
    {
        matrice_1[a] = new int[m];

    }
    matrice_2 = new int*[n];
    for(a=0; a<n; a++)
    {
        matrice_2[a] =new int[m];
    }
    matrice_3 = new int*[n];
    for(a=0; a<n; a++){
        matrice_3[a] = new int[m];
    }
    printf("Introduceti valori pentru mat1;");
    for(a=0; a<n; a++)
    {
        for(b=0; b<m; b++)
        {
            printf("\n\rmatrice[%d][%d]",a,b);
            scanf("%d",&matrice_1[a][b]);
        }
    }

    printf("Introduceti valori pentru mat2;");
    for(a=0; a<n; a++)
    {
        for(b=0; b<m; b++)
        {
            printf("\n\rmatrice[%d][%d]",a,b);
            scanf("%d",&matrice_2[a][b]);
        }
    }

    printf("\n\rse calculeaza..");
    for(a=0; a<n; a++)
    {
        for(b=0; b<m; b++ )
        {
            matrice_3[a][b] = matrice_1[a][b] + matrice_2[a][b];
        }
    }
    for(a=0; a<n; a++)
    {
        for(b=0; b<m; b++)
        {
            printf("\n\r matrice1[%d][%d] + matrice2[%d][%d]= %d",a,b,a,b,matrice_3[a][b]);
            printf("\n");
        }
    }
    return 0;
}
