#include <stdio.h>
int main() 
{
  int row , col , num , count = 2 ;
  scanf("%d",&num);
  for( row = 1 ; row <= num ; row++ )
  {
  	if( row % 2 != 0)
    {
      for( col = 1 ; col <= num ; col++ )
      {
        if( col == num )
        {
          printf("%d", count);
          count++;
        }
        else
          printf("%d", row);
       }
    }
    else
    {
      for( col = 1 ; col <= num ; col++ )
      {
        if( col == 1 )
        {
          printf("%d", count);
          count++;
        }
        else
          printf("%d", row);
       }
    }
    printf("\n");
  }
	return 0;
}