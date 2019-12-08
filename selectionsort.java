import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
    int i=0,j,min,p=0,t,a[],n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        min=a[i];
        p=i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<min)
            {
                min=a[j];
                p=j;
            }
        }
        t=a[i];
        a[i]=a[p];
        a[p]=t;
        //System.out.println(a[i]+" "+i);
    }
    for(i=0;i<n;i++)
    {
     System.out.print(a[i]+" "); 
    }
}
}
