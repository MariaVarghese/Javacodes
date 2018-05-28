import java.util.*;

class DequeTest
{
	public static void main(String args[])
	{
		Deque<String> d=new ArrayDeque<String>();
		d.offer("Vinodh");
		d.offer("Ajay");
		d.add("Karthik");
		d.offerFirst("Ram");
		System.out.println("After offerFirst :");
		for(String str : d)
		{
			System.out.println(str);
		}
		d.pollLast();
		System.out.println("After poll last :");
		for(String str : d)
		{
			System.out.println(str);
		}
	}
}