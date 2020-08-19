public class Main
{
	public static void main(String[] args) {
	   int a=10; // 1010
	   int b=9; // 1001
	   int c= a&b; // 1000
	   System.out.println(c);
	   c = a|b; // 1011
	   System.out.println(c);
	   c= a^b; // 0011
	   System.out.println(c);
	   c=~a; // 2's complement of  1's complement of(10)
	   System.out.println(c); // 1011 here starting 1 denode the negative sign
	}
}
 
