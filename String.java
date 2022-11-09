/* There are three lines of output:
For the first line, sum the lengths of  A and B.
For the second line, write Yes if  A is lexicographically greater than  B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.


*/
import java.io.*;
import java.util.*;

public class String {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
    
    System.out.println(A.length()+B.length());
    if(A.compareToIgnoreCase(B)<=0) 
    {
        System.out.println("No");
    }       
    else 
        System.out.println("Yes");
    System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    }
}



