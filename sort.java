import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String title,author;
    double price;
    ArrayList<Book> books=new ArrayList<Book>();
    for(int i=0;i<3;i++)
    {
        id=sc.nextInt();
        title=sc.next();
        author=sc.next();
        price=sc.nextDouble();
        books.add(new Book(id,title,author,price));
    }
    ArrayList<Book> b=sorts(books);
	}
	public static ArrayList<Book> sorts(ArrayList<Book> books)
	{
	    for(int i=0;i<3;i++)
	    {
	        for(int j=i+1;j<3;j++)
	        {
	            if(books.get(i).getprice()>books.get(j).getprice())
	            {
	                Book book=books.get(i);
	                books.set(i,books.get(j));
	                books.set(j,book);
	            }
	        }
	        System.out.println(books.get(i).getid());
	    }
	    return books;
}
}

class Book
{
    int id;
    String title,author;
    double price;
    public Book(int id,String title,String author,double price)
    {
        this.id=id;
        this.title =title;
        this.author=author;
        this.price=price;
    }
    public int getid()
    {
        return this.id;
    }
    public String gettitle()
    {
        return this.title;
    }
    public String getauthor()
    {
        return this.author;
    }
    public double getprice()
    {
        return this.price;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void settitle(String title)
    {
        this.title=title;
    }
    public void setauthor(String author)
    {
        this.author=author;
    }
    public void setprice(double price)
    {
        this.price=price;
    }
}
