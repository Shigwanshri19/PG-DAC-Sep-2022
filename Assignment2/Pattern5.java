class Pattern5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
		int alphabet=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alphabet + i)+" ");
			}
			System.out.println();
		}
	}
}