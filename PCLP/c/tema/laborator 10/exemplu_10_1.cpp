#include<stdio.h>
#include<conio.h>
#define N 5 //stabilirea dimensiunii tabloului (constanta)
void citire(int t[]);
void afisare(int t[]);
int maxim(int t[]);
void ordonare(int t[]);
int main()
{ 
    int tab[N];
    citire(tab);
    printf("\nSe afiseaza valorile elementelor de tablou");
    afisare(tab);
    printf("\nValoarea maxima este: %d", maxim(tab));
    ordonare(tab);
    printf("\nSe afiseaza valorile elementelor de tablou");
    afisare(tab);
    getch();
}
void citire(int t[])
{ 
    int i;
    for (i=0;i<N;i++)
    { 
        printf("\nelementul [%d]=", i+1);
        scanf("%d",&t[i]);
    }
}
void afisare(int t[])
{ 
    int i;
    for (i=0;i<N;i++)
    printf("\nelementul [%d]= %d", i+1, t[i]);
}
int maxim(int t[])
{ 
    int i, max=t[0];
    for (i=1;i<N;i++)
        if(max<t[i])
            max=t[i];
        return max;
}
void ordonare(int t[]) //bubble sort
{ 
    int i, k, aux;
    do
    {
        k=0;
        for(i=0;i<N-1;i++)
        if(t[i]>t[i+1])
        {
            aux=t[i];
            t[i]=t[i+1];
            t[i+1]=aux;
            k=1;
        }
    }
    while(k!=0);
}