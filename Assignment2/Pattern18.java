class Pattern18
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int alphabet=65;
			for(int j=5;j>=i;j--)
			{
				System.out.print((char) alphabet +" ");
				alphabet++;
			}
			System.out.println();
		}
	}
	
}