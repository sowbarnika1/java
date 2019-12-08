import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        Rev r=new Rev();
       r.reverse(num);
    }
}
class Rev{
    static int n=0;
    public static void reverse(int num)
    {
        if(num>0)
        {
        n=n+num%10;
        n=n*10;
        reverse(num/10);
        }
        else
        {
            n=n/10;
            System.out.println(n);
        }
    }
}
