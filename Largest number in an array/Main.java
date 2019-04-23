#include<stdio.h>
int main()
{
  int arr_size , i , max ;
  scanf( "%d\n" , &arr_size );
  int arr[arr_size];
  for( i = 0 ; i < arr_size ; i++ )
    scanf( "%d ", &arr[i] );
  max = arr[0];
  for( i =0 ; i < arr_size-1 ;  i++ )
    if( max < arr[i+1])
      max = arr[i+1];
  printf("%d" , max);
  return 0;
}