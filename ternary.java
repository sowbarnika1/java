public class Main
{
	public static void main(String[] args) {
	    Object obj1;
	    if(true)
	        obj1=new Integer(10);
	    else
	        obj1= new Double(20.2);
		System.out.println(obj1); 
		Object obj2;
		obj2=true ? new Integer(10) : new Double(20.2);
		System.out.println(obj2); // here ternary operator store the value as a maximun size datatype
	}
}
