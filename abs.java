abstract class Area
{
	abstract void sqarea(int s);
	abstract void rearea(int l, int b);
	abstract void ciarea(float r);
}
class abs extends Area
{
	void sqarea(int s)
	{
		int a=s*s;
		System.out.println("Area of a square : "+a);
	}
	void rearea(int l, int b)
	{
		int a=l*b;
		System.out.println("Area of a rectangle : "+a);
	}
	void ciarea(float r)
	{
		float a=3.14f*r*r;
		System.out.println("Area of a circle : "+a);
	}
	public static void main(String[] args)
	{
		abs ar = new abs();
		ar.sqarea(10);
		ar.rearea(20, 30);
		ar.ciarea(10);
	}
}		