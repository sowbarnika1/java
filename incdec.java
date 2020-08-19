public class Main
{
	public static void main(String[] args) {
	    int b=1;
	    b=b++; // here we assign the value then inc so b value is same as we initialize
	    int a=b++; //post inc 
	    System.out.println(a); //output is 1
	    a=++b; // pre inc
		System.out.println(a);// output is 3
		a=b--; // post dec
		System.out.println(a); // output is 3
		a=--b; // pre dec
		System.out.println(a); // output is 1
	}
}
