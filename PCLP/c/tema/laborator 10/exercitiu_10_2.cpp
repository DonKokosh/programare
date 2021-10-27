#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    printf("introduceti un cuvant");
    char sir[20]= "";
    char alt_sir[20] ="";
    scanf("%s",&sir);
    printf("\n\rintroduceti celalat cuvant:");
    scanf("%s",&alt_sir);
    copiaza_caracter(sir);
 concatenare(sir, alt_sir);
    return 0;
}

void copiaza_caracter(char *sir_1){

    char copiere[20]="";
    {
        for(int a=0; *(sir_1 + a)!=NULL; a++)
        {
           copiere[a] = *(sir_1 + a);
        }
    }
    printf("\n\rcuvantul copiat, este");
    printf("\n\r");
    for(int a=0; a<copiere[a] !=NULL; a++)
    {
        printf("%c",copiere[a]);
    }


}
void comparare(char *sir_1, char *sir_2){
int a,b;
    for ( a=0; *(sir_1+a)!=NULL; a++);

    for(b=0; *(sir_2+b)!=NULL; b++,a++)
    {
        if(*sir_1==*sir_2)
        {
           printf("\nSirurile sunt la fel!");
        }
        else
        {
            printf("\nSirurile nu sunt egale!");
            break;
        }

    }
}


void concatenare(char *sir_1, char *sir_2){
    int a=0;
    for ( a=0; *(sir_1 + a)!=NULL; a++);

    int b=0;

    for(b=0; *(sir_2+b)!=NULL; b++, a++)
    {
        *(sir_1 + a) = *(sir_2 + b);
    }

    *(sir_1 + a) ='\0';
    printf("\n\rConcatenare:");
    printf("\n\r");

    for(int k=0; *(sir_1 +k)!='\0'; k++)
    {
        printf("%c",*(sir_1+k));
    }

}
