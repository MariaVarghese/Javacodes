import java.util.ArrayList;
import java.util.Iterator;

public class Arr
{
	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();
		
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