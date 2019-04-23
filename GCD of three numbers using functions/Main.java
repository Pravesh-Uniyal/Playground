#include<stdio.h>
int main(){
    int n,n1,n2,ans;
    scanf("%d%d%d",&n,&n1,&n2);
    ans=power(n,n1,n2);
    printf("%d",ans);
    return 0;
}
int power(int x,int y,int z){
  if ((x<y) && (x<z) )
      return x;
  else if ((x<y) && (z<x))
     return z;
  else
    return y;
  
}