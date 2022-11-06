import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String findDay(int month, int day, int year) {
        int rem=year/2000;
        int yearcode=rem+rem/4;
        int monthcode=0;
        month=month/10;
        day=day/10;
        if(month==8)
            monthcode=1; 
        else if(month==2 || month==11 ||month==3)
            monthcode=2;
        else if(month==6)
            monthcode=3;
        else if(month==9 || month==12)
            monthcode=4;
        else if(month==5 || month==7)
            monthcode=5;
        else if(month==1 || month==10)
            monthcode=6;
    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    {
        if(month==1)
            monthcode=5;
        else if(month==2)
            monthcode=1;
    }
    int daycode=(day+monthcode+yearcode)/7;
System.out.println(day+ " "+month+" "+daycode+" "+monthcode+);
    if(daycode==0)
        return "SUNDAY";
    else if (daycode==1)
        return "MONDAY";
    else if (daycode==2)
        return "TUESDAY";
    else if (daycode==3)
        return "WEDNESDAY";
    else if (daycode==4)
        return "THURsDAY";
    else if (daycode==5)
        return "FRIDAY";
    else if (daycode==6)
        return "SATURDAY";
    else 
        return null;

        
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
