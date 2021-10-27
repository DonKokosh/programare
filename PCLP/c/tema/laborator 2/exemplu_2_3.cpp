#include <stdio.h>
#include <conio.h>

int a = 5;

int f1(void)
{
    printf("\na = %d" , a);
}
int f2(void)
{
    int a = 7;
    printf("\na = %d" , a);
}

int main()
{
    int b = 10, c = 20;
    printf("\na = %d, b = %d, c = %d" , a, b, c);
    {
    int b = 100, d = 1000;

    printf("\na = %d, b = %d, c = %d, d = %d" , a, b, c, d);
    }

    printf("\na = %d, b = %d, c = %d" , a, b, c);
    

    puts("\nSe executa functia f1");
    f1();
    
    puts("\nSe executa functia f2");
    f2();
}