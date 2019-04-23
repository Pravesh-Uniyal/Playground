#include<stdio.h>
int main(){
    int n,n1,ans;
    scanf("%d%d",&n,&n1);
    power(n,n1);
    
  	return 0;
}
void power(int x,int y){
  int a=1,i;
  for(i=1;i<=y;i++)
    a=a*x;
    printf("%d",a);
  
}