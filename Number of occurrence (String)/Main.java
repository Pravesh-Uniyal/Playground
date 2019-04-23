#include<stdio.h>
#include <string.h>
int main()
{ 
  int i,ln,ln1;
  char str1[100],str2[100];
  gets(str1);
  gets(str2);
  for(i=0;i<=strlen(str1);i++)
  {
	    if(str1[i]>=65 && str1[i]<=92)
	    {
		str1[i]=str1[i]+32;
	    }
  }
  for(i=0;i<=strlen(str2);i++)
  {
	    if(str2[i]>=65 && str2[i]<=92)
	    {
		str2[i]=str2[i]+32;
	    }
  }
  ln = strlen(str1);
  ln1= strlen(str2);
  int c=0,j=0;
  for(i=0;i<ln;i++){
      if(str1[i]==str2[j]){
        j=j+1;
    if (j==ln1){
      j=0;
     c=c+1;
    }
  }
  }
  printf("%d",c);
 return 0;
}