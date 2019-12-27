import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
            int id,n;
            String city,name;
           Sample[] s=new Sample[4];
           Scanner sc=new Scanner(System.in);
           for(int i=0;i<4;i++)
           {
               id=sc.nextInt();
               city=sc.next();
               name=sc.next();
               n=sc.nextInt();
               s[i]=new Sample(id,city,name,n);
           }
            Sample[] sa=search(s);
            for(int i=0;i<4;i++)
                {
            System.out.println(s[i].getn());
            }
	}
            public static Sample[] search(Sample[] s)
            {
                for(int i=0;i<4;i++)
                {
                    for(int j=i+1;j<4;j++)
                    {
                    if(s[i].getn()>s[j].getn())
                    {
                       Sample sow=s[i];
                       s[i]=s[j];
                       s[j]=sow;
                    }
                    }
                
                }
                return s;
            }
}
class Sample
{
    private int id,n;
   private String city,name;
    Sample(int id,String name,String city,int n)
    {
        this.id=id;
        this.name=name;
        this.city=city;
        this.n=n;
    }
    public int getid()
    {
        return this.id;
    }
    public String getname()
    {
        return this.name;
    }
    public String getcity()
    {
        return this.city;
    }
    public int getn()
    {
        return this.n;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setcity(String city)
    {
        this.city=city;
    }
    public void setn(int n)
    {
        this.n=n;
    }
    
}
