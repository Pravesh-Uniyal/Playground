#include <stdio.h>
int main() 
{
  int a,s=1,first_digit,last_digit,count,temp;
  scanf("%d",&a);
  temp = a;
  last_digit = a%10;
 
  while(a>0)
  {
  	count++;
    a = a/10;
  }
  count--;
  while(count>0)
  {
    s = s*10;
    count--;
  }
  first_digit = temp/s;
  printf("%d",last_digit + first_digit);
  
	return 0;
}