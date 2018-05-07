import java.util.Scanner;
interface Area1 
{
	void areacal();
}
interface Perimeter 
{
	void perical();
}
class Rectangle implements Area1, Perimeter 
{
	float ll,bb,ar,pr;
	public void assign() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of Rectangle : ");
		ll = sc.nextFloat();
		System.out.println("Enter The Breadth Of Rectangle : ");
		bb = sc.nextFloat();
	}
	public void areacal() 
	{
		ar = (float) (ll*bb);
	}
	public void perical() 
	{
		pr = (float) (2 * (ll+bb));
	}
	public void display() 
	{
		System.out.println("The Length Of Rectangle Is " + ll + " And Breadth Is " + bb + " Area Is " +ar + " Perimeter Is " + pr);
	}
}
class Rect 
{
	public static void main(String args[]) 
	{
		float ll, bb;

		Rectangle rr = new Rectangle();
		rr.assign();
		rr.areacal();
		rr.perical();
		rr.display();
	}
}
