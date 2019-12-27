import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
            int id,n;
            String city,name;
           ArrayList<Sample> s=new ArrayList<Sample>();
           Scanner sc=new Scanner(System.in);
           for(int i=0;i<4;i++)
           {
               id=sc.nextInt();
               city=sc.next();
               name=sc.next();
               n=sc.nextInt();
               s.add(new Sample(id,name,city,n));
           }
            ArrayList<Sample> sa=search(s);
            for(int i=0;i<4;i++)
                {
            System.out.println(s.get(i).getid());
            }
	}
            public static ArrayList<Sample> search(ArrayList<Sample> s)
            {
                for(int i=0;i<4;i++)
                {
                    for(int j=i+1;j<4;j++)
                    {
                    if(s.get(i).getn()>s.get(j).getn())
                    {
                       Sample sow=s.get(i);
                       s.set(i,s.get(j));
                       s.set(j,sow);
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
