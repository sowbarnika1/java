import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] args) {
	 long a,b,c=0,sum=0,p=1;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextLong();
	 b=sc.nextLong();
	 while(a!=0 || b!=0)
	 {
	     sum=sum+(int)((a%10+b%10+c)%2)*p;
	     c=(int)(a%10+b%10+c)/2;
	     p=p*10;
	     a=a/10;
	     b=b/10;
	 }
	 sum=sum+c*p;
	 System.out.print(sum);
	}
}
