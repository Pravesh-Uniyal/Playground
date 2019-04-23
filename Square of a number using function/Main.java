#include<stdio.h>
int main() {
  int num,pr;
   scanf("%d",&num);
   pr=fun(num);
  printf("%d",pr);
   return 0;
}
int fun(num){
  int pro =num*num;
  return pro;
}