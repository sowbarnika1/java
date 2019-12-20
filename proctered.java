import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[] args)
  {
    String name, id, tech, s;
    int yr;
    Scanner sc = new Scanner (System.in);
    Associate a[] = new Associate[5];

    for (int i = 0; i < 5; i++)
      {
	id = sc.next ();
	name = sc.next ();
	tech = sc.next ();
	yr = sc.nextInt ();
	a[i] = new Associate (id, name, tech, yr);
      }
    s = sc.next ();
    Associate t[] = given (s, a);
  }

    static Associate[] given (String s, Associate a[])
    {
      int j = 0;
      Associate temp[] = new Associate[5];
      for (int i = 0; i < 5; i++)
	{
	  if (a[i].gettech ().equals (s.toLowerCase ())
	      && a[i].getyr () % 5 == 0)
	    {
	        System.out.println(a[i].getid());
	      temp[j] = a[i];
	      j++;
	    }
	}
      return temp;
    }
}


class Associate
{
  private String id, name, tech;
  private int yr;
  Associate(String id,String name,String tech,int yr)
  {
      this.id=id;
      this.name=name;
      this.tech=tech;
      this.yr=yr;
  }
  public String getid ()
  {
    return this.id;
  }
  public String getname ()
  {
    return this.name;
  }
  public String gettech ()
  {
    return this.tech;
  }
  public int getyr ()
  {
    return this.yr;
  }
public void  setid (String id)
  {
    this.id=id;
  }
public void  setname (String name)
  {
    this.name=name;
  }

public void  settech (String tech)
  {
    this.tech=tech;
  }
public void  setyr (int yr)
  {
    this.yr=yr;
  }

}
