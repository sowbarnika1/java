import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]=new int[10];
	    int i=0;
	    while(true)
	    {
	        try {
    	    Scanner sc=new Scanner(System.in);
	       a[i]=sc.nextInt();
	        i++;
	        }
	        catch(InputMismatchException e)
	        {
	            System.out.println("please enter an integer");
	            continue;
	        }
	        catch(ArrayIndexOutOfBoundsException e1)
	        {
	            System.out.println("array out of bound");
	            //sc.close();
	            break;
	        }
	    }
		//System.out.println("Hello World");
	}
}
