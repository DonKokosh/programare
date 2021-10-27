#include<stdio.h>
#include<conio.h>
int main()
{
int zi;
printf("\nIntrodu un numar <=7 :");
scanf("%d", &zi);
switch (zi) 
{
        case 1: printf("\nZiua %d este Luni", zi);break;
        case 2: printf("\nZiua %d este Marti", zi);break;
        case 3: printf("\nZiua %d este Miercuri", zi);break;
        case 4: printf("\nZiua %d este Joi", zi);break;
        case 5: printf("\nZiua %d este Vineri", zi);break;
        case 6: printf("\nZiua %d este Sambata", zi);break;
        case 7: printf("\nZiua %d este Duminica", zi);break;
        default: printf("\nValoarea introdusa este incorecta !");
}
printf("\n");
getch();
} 
