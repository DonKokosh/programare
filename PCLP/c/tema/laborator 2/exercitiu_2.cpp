#include <stdio.h>

#define PI 3.14

int main()
{
  float radius, sa,Volume;

  printf("\n Introduceti suprafata sferei \n");
  scanf("%f", &radius);

  sa =  4 * PI * radius * radius;
  Volume = (4.0 / 3) * PI * radius * radius * radius;

  printf("\n Suprafata sferei este = %.2f", sa);
  printf("\n Volumul sferei este = %.2f", Volume);

  return 0;
}