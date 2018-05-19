import java.util.*;
import java.util.Iterator;

public class link
{
	public static void main(String[] args)
	{
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("Serah");
		obj.add("Serena");
		obj.add("Maria");
		obj.add("Sunej");
		obj.add("Rini");
		obj.add("Mariamma");
		obj.add("Varghese");

		Iterator it = obj.iterator();

		while(it.hasNext())
		{
			String n = (String)it.next();
			System.out.println(n);
		}
	}
}