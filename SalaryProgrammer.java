class Salary
{
	float pay=30000;
}
class Programmer extends Salary
{
	int bonus=1000;
}
class SalaryProgrammer
{
	public static void main(String[] args)
	{
		Programmer p= new Programmer();
		System.out.println("Salary : "+p.pay);
		System.out.println("Bonus : "+p.bonus);
	}
}
