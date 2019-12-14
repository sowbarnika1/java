import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s;
		int l;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		l='z';
		for(int i=0;i<s.length();i++)
		{
		    if(l>s.charAt(i))
		    {
		        l=s.charAt(i);
		    }
		}
	System.out.println((char)l);
	}
}
