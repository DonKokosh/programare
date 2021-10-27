#include <stdio.h>
#include <conio.h>
void func(void)
{
 int a=10;
 static int b=10;
 a=a+1;
 b=b+1;
 printf("\na=%d, b=%d", a, b);
}
int main()
{
 func();
 func();
 func();
 getch();
} 
