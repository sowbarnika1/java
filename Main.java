package school;
import java.io.*;
import java.util.*;
public class Main
{
	private int ratings;
	private String name,type;
	private boolean rec;
	private Address address;
	ArrayList<Classroom> list=new ArrayList<Classroom>();
	public Main(String name,String type,int ratings,boolean rec,String addline,String city,String state,String country)
	{
	    this.name=name;
	    this.type=type;
	    this.ratings=ratings;
	    this.rec=rec;
	    this.address=new Address();
	    this.addline=setaddline(String addline);
	    this.city=setcity(String city);
	    this.state=setstate(String state);
	    this.country=sercountry(String country);
	}
}
