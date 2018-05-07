class Var
{
	public void fun(int... a)
	{
		System.out.println("Number of arguments : "+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
	}
}
class ArrVar
{
	public static void main(String[] args)
	{
		Var v=new Var();
		v.fun(100);
		v.fun(2,3,4);
		v.fun();
	}
}
