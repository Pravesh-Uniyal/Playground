#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=(a/100)+(a%10);
  printf("%d",b);
  return 0;
}