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
class General
{
	public static void main(String[] args)
	{
		Boy b= new Boy();
		b.eat();
	}
}