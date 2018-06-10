class TestString
{
	public static void strOne(String s1)
	{
		s1 = s1 + "Java World";
	}
	public static void strTwo(StringBuilder s2)
	{
		s2.append("Java World");
	}
	public static void strThree(StringBuffer s3)
	{
		s3.append("Java World");
	}
	
	public static void main(String[] args)
	{
		String s1 = "maria";
		strOne(s1);
		System.out.println("String One "+s1);


		StringBuilder s2 = new StringBuilder("maria");
		strTwo(s2);
		System.out.println("String Two "+s2);


		StringBuffer s3 = new StringBuffer("maria");
		strThree(s3);
		System.out.println("String Three "+s3);
	}
}
