class Main
{
    public static void main(String args[])
    {
        int[] a={4,1,6,2,7};
    int i=0,j,min,p=0,t;
    
    for(i=0;i<a.length;i++)
    {
        min=a[i];
        for(j=i+1;j<a.length;j++)
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
    for(i=0;i<a.length;i++)
    {
     System.out.println(a[i]); 
    }
}
}
