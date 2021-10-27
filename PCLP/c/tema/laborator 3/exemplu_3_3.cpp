#include <stdio.h>
#include <conio.h>
#include <stdlib.h>


int main()
{ 
    char caracter = 'A';
    int nr_intreg = 20;
    float nr_real = 123.45;
    double nr_double = 1122.33E3;
    char sir[30] = "Hey";
    
    printf("caracter = %c\n", caracter );
    printf("intreg = %d\n", nr_intreg);
    printf("real = %f\n", nr_real );
    printf("real dublu = %e\n", nr_double);
    printf("sir de caractere = %s\n", sir);
    getch();
} 
