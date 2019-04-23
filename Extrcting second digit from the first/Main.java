#include <stdio.h>
int main() 
{
  int a,n,temp,count,s=1;
  scanf("%d",&a);
  temp=a;
  while(a>0)
  {
  	count++;
    a = a/10;
  }
  count = count-2;
  while(count>0)
  {
  	s = s*10;
    count--;
  }
  temp = temp/s;
  temp = temp%10;
  printf("%d",temp);
	return 0;
}