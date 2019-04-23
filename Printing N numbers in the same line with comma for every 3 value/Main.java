#include <stdio.h>
int main() 
{
  int a,count=-1;
  scanf("%d",&a);
  for(int i=1 ; i<=a ; i++)
  {
  	count++;
    if(count==3)
    {
    	count = 0;
      	printf(",");
    }
    printf("%d",i);
  }
	return 0;
}