import java.util.*;
import java.util.Iterator;

class Tree
{
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();

		ts.add("C");
		ts.add("A");
		ts.add("B");

		ts.add("A");

		System.out.println(ts);
	}
}