import java.util.*;
import java.util.Iterator;

class StudentArr
{
	int id;
	String name;
	StudentArr(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id + " " + name ;
	}
	public static void main(String[] args)
	{
		ArrayList<StudentArr> a = new ArrayList<StudentArr>();
		a.add(new StudentArr(1,"Maria"));
		a.add(new StudentArr(2,"Serah"));
		a.add(new StudentArr(3,"Serena"));
		Iterator it = a.iterator();

		while(it.hasNext())
		{
			StudentArr n = (StudentArr)it.next();
			System.out.println(n.toString());
		}
	}
}