#include <stdio.h>
int main()
{
  int num=1,a;
  scanf("%d",&a);
	for(int i=1 ; i<=a ; i++)
    {
    	for(int j=1 ; j<=i ; j++)
        {
        	if(num%2==0)
            {
              printf("#");
              num++;
            }
          	else
            {
              printf("*");
              num++;
            }
        }
      printf("\n");
    }
  	return 0;
}
  