#include<stdio.h>
int main()
{
  int size , i , count , number_of_ones ;
  scanf("%d\n" , &size);
  int arr[size];
  for( i = 0 ; i < size ; i++ )
    scanf("%d " , &arr[i]);
  for( i = 0 ; i < size ; i++ )
  {
  	if(arr[i] == 0)
      count++;
  	else
      printf("%d ", arr[i]);
  }
  for( i = 0 ; i < count ; i++)
    printf("0 ");
  

    return 0;
}
