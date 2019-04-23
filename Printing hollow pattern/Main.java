#include <stdio.h>
int main() 
{
  int col , row , num;
  scanf("%d",&num);
  for( row = 1 ; row <= num ; row++ )
  {
  	if( row == 1 || row == num )
    	for( col = 1 ; col <= num ; col++ )
          printf("*");
    else 
    {
    	for(col = 1 ; col <= num ; col++ )
        {
        	if(col == 1 || col == num)
              printf("*");
          	else 
              printf(" ");
        }
    }
    printf("\n");
  }
	return 0;
}
