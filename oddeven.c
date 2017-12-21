#include <stdio.h>

int main(void) 
{
    int number;
    printf("\n enter number\n");
    scanf("%d",&number);
    if(number%2==0)
	{
	    printf("\n the number is even");
	}
	else
	{
	    printf("\n the number is odd");
	}
	return(0);
}
