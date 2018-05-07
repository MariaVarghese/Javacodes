class Human
{
	public void eat()
	{
		System.out.println("Human is eating");
	}
}
class Boy
{
	public void eat()
	{
		System.out.println("Boy is eating");
	}
}
class Inst
{
	public static void main(String[] args)
	{
		Boy b= new Boy();
		Human h = new Human();
		if(h instanceof Human)
		{
			System.out.println("h is a instance of human");
		}
		else if(b instanceof Boy)
		{
			System.out.println("b is a instance of boy");
		}
		else
		{
			System.out.println("Nothing");
		}	
	}
}