public class References
{

	// This is commeNT
	
	public static void main(String[] args)
	{
		int m = 5;
		int n = 165;

		System.out.println("M=" + m + " N=" + n);
		swap2(m, n, m);
		System.out.println("M=" + m + " N=" + n);
	}
	
	private static void swap(int a, int b)
	{
		int c = a;
		a = b;
		b = c;
	}
	
	private static void swap2(int a, int b, int d)
	{
		int c = a;
		a = d;
		b = d;
	}
}
