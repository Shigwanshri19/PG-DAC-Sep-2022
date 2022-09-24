class Pattern9
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			int alphabet =65;
			for(int f=5;f>=i;f--)
			{
				System.out.print((char)(alphabet)+" " );
				alphabet++;
				
				
			}
			System.out.println();
		}
	}
}