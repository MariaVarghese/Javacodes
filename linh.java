import java.util.*;
import java.util.Iterator;

public class linh
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		
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