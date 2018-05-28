import java.util.*;

class Mapp
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a",10);
		hm.put("b",30);
		hm.put("c",20);
		hm.put("d",40);
		Set s1 = hm.entrySet();
		System.out.println(s1);
	}
} 
