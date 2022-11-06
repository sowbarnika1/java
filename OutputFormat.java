import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                if(s1.length()<15)
                {
                    System.out.print(s1);
                    for(int j=s1.length();j<15;j++)
                    {
                        System.out.print(" ");
                    }
                }
                if(String.valueOf(x).length()==1)
                {
                    System.out.print("00");
                }
                if(String.valueOf(x).length()==2)
                {
                    System.out.print("0");
                }
                    System.out.println(x);
            }
            System.out.println("================================");

    }
}

/*Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

*/
