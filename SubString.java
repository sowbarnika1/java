/*Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
*/
import java.util.Scanner;

public class SubString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
     
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int j=0;j+k<s.length();j++)
        {
        a : for(int i=j;i<s.length();i++)
        {
            if(s.substring(i,i+k).compareTo(smallest)<0)
                smallest=s.substring(i, i+k);
                //System.out.println(s.substring(i,i+k));
            if(s.substring(i,i+k).compareTo(largest)>0)
                largest=s.substring(i, i+k);
            if(i+k-1<s.length())
            {
            i=i+k-1;
            }
            if(i+k>=s.length())
                break a;
            }
            }
        
        

        return smallest + "\n" + largest;
    }

