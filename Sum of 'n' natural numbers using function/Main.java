#include<stdio.h>
int main() {
  int num,pr;
   scanf("%d",&num);
   pr=natural_num(num);
  printf("%d",pr);
   return 0;
}
int natural_num(num){
  int sum=0;
  for(int i=1;i <= num;i++){
    sum=sum+i;}
    return sum;
  
    
  
  return ;
}