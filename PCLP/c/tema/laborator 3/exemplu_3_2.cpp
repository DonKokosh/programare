#include<stdio.h>
#include<conio.h>
int main(void)
{
    char sir1[30]="primul sir";
    char sir2[30]="al doilea sir";
    puts("sir1:");
    puts(sir1);
    puts("sir2:");
    puts(sir2); 
    puts("\nIntrodu un sir de caractere:");
    gets(sir1);
    puts("\nIntrodu un sir de caractere:");
    gets(sir2);
    puts("sir1:");
    puts(sir1);
    puts("sir2:");
    puts(sir2);
    getch();
}