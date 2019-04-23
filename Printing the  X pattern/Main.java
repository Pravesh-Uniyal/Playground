#include <stdio.h>
int main() 
{
  int row , col , num;
  scanf("%d",&num);
  int count = num;
  for( row = 1 ; row <= num ; row++ )
  {
  	for( col = 1 ; col <= num ; col++ )
    {
    	if( row == col || (num+1)==(row+col))
        {
        	printf("*");
        }
      	else
          printf(" ");
     }
    printf("\n");
  }
	return 0;
}

