import java.lang.Enum;
    

public class Main
{
    enum Day{sunday(0),monday(1),tuesday(2),wednesday(3),thursday(4),friday(5),saturday(6);
     private int v;
     private Day(int v){
        this.v=v;
    }}
	public static void main(String[] args) {
	    for(Day d:Day.values())
	    {
	        
		System.out.println(d+" "+d.v);
	    }
	}
}
