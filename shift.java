public class Main
{
	public static void main(String[] args) {
	    int a=8,b;//1_000
	    b=a<<2; // left shift by 2
		System.out.println(b);// 1_000_00 -> 32
		b=a<<4; // LS by 4
		System.out.println(b);// 1_000_0000 -> 128
		a=b; // a=128;
		b=a>>2; // right shift by 2
		System.out.println(b); // 1_000_00 -> 32
		b=a>>4; // RS by 4
		System.out.println(b); // 1_000 -> 8
	}
}
