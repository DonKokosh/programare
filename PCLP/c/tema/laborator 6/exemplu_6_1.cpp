#include<stdio.h>
#include<conio.h>
int main ()
{
    int i;

    //se afiseaza codul ASCII folosind instructiunea for
    for( i=1 ; i<255 ; i++)
    {
        printf("%3d - %c ", i, i);
            if( !( i%8 )) // dupa afisarea a 8 valori se trece la rand nou
            {
                printf("\n");
            }    
    }
    getch();    
    //se afiseaza codul ASCII folosind instructiunea while
    i=1;
    while( i<255 )
    {
        printf("%3d- %c ", i, i);
        if( !( i%8 ))
        {
            printf("\n");
            i++;
        }
    }

    getch();    
    //se afiseaza codul ASCII folosind instructiunea do...while
    i=1;
    do
    {
        printf("%3d - %c ", i, i);
        if( !( i%8 ))
        {
            printf("\n");
            i++;

        }
    }
    while( i<255 );
    getch();
} 