#include<stdio.h>
#include<string.h>
int main()
{
  int i,j,n,k=0,l=0,f=0;   
  char str[100],b[100];
  char temp[50][50];
 // gets(str);
 scanf("%[^\n]s",str);
  n=strlen(str);
for(int i=0;i<50;i++)
{
    for(int j=0;j<50;j++)
    {
        temp[i][j]='\0';
    }
}

  for(i=0;i<n;i++)
  {
      if(str[i]!=' ')
      {
          temp[k][l]=str[i];
          l++;
      }
      else
      {
          k++;
          l=0;
      }
  }
     //printf("%d",k);
  for(i=0;i<k;i++)
    {
    for(j=i+1;j<k;j++)
      {
        if(strcmp(temp[i],temp[j])>0)
          {
            strcpy(b,temp[i]);
            strcpy(temp[i],temp[j]);
            strcpy(temp[j],b);
          }
      }
    }
  //printing sorted elements 
  printf("In lexicographical order: \n");
  for(i=0;i<k;++i)
    {
    b=st
     // strcpy(b,strlwr(b));
        for(j=i+1;j<k;j++)
        {
            if(strcmp(temp[i],temp[j])==0)
            {
                f=0;
                break;
                
            }
            else
            {
                f=1;
            }
        }
        if(f==1)
        {
      printf("%s",temp[i]);
      printf("\n");
        }
    }
}
