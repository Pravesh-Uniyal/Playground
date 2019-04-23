#include<stdio.h>
int main()
{
  int i , arr_size , ele1 , ele2 , flag; 
  scanf( "%d\n" , &arr_size );
  int arr[arr_size];
  for( i = 0 ; i < arr_size ; i++ )
  	scanf( "%d " , &arr[i] );
  scanf( "\n%d" , &ele1 );
  scanf( "\n%d" , &ele2 );
  
  for( i = 0 ; i < arr_size ; i++)
  {
  	if( ele1 == arr[i])
    {
      printf("%d\n" , i);
      flag++;
    }
  }
  if( flag == 0)
    printf("-1\n");
  flag=0;
  
  for( i = 0 ; i < arr_size ; i++)
  {
  	if( ele2 == arr[i])
    {
      printf("%d\n" , i);
      flag++;
    }
  }
  if( flag == 0)
    printf("-1\n");
  
  
  
  return 0;
}