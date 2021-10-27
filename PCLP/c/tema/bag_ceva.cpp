/* Consider the following example that uses the realloc function from C:*/
#include <conio.h> /* _getch */
#include <stdio.h> /* printf, scanf, puts */
#include <stdlib.h> /* realloc, free, exit, NULL */
int main ()
{
    int input,n;
    int count = 0;
    int* numbers = NULL;
    int* more_numbers = NULL;
    do
    {
        printf ("Enter an integer value (0 to end): ");
        scanf ("%d", &input);
        count++;
        more_numbers = (int*) realloc (numbers, count * sizeof(int));
        if (more_numbers!=NULL)
        {
            numbers=more_numbers;
            numbers[count-1]=input;
        }
        else
        {
            free (numbers);
            puts ("Error (re)allocating memory");
            exit (1);
        }
    }
    while (input!=0);
        printf ("Numbers entered: ");
    for (n=0;n<count;n++)
        printf ("%d ",numbers[n]);
    int nr;
    do
    {
        printf("\n more numbers:");
        scanf ("%d", &nr);
    }
    while(nr<=count);
        more_numbers = (int*) realloc (numbers, nr * sizeof(int));
    printf ("Numbers entered: ");
    for (n=0;n<nr;n++)
        printf ("%d ",numbers[n]); // the new elements have residual values
    printf("\nRead values for new elements:\n");
    for (n=count;n<nr;n++)
    {
        printf ("numbers[%d]=", n);
        scanf("%d", &numbers[n]);
    }
    printf ("The numbers are now: ");
    for (n=0;n<nr;n++)
        printf ("%d ",numbers[n]);
    free (numbers);
    _getch();
    return 0;
}