class CloneArray
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3};

		int clonearr[]= arr.clone();
		System.out.println(arr==clonearr);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(clonearr[i]+" ");
		}
	}
}