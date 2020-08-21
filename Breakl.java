public class Breakl{
     public static void main(String[] args) {
         Loop:// label for the loop
	    for(int i=0;i<5;i++)
	    {
	        for (int j=0;j<5;j++)
	        {
                    if(i==3)
                       break Loop; // break the outer loop
                       //break; // break the inner loop
	            System.out.print("*");
           }
	        System.out.println("");
	    }
	}
}
