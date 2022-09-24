class Pattern7
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			int a=1;
			for(int f=5;f>=i;f--)
			{
				System.out.print(a+" " );
				a++;
			}
			System.out.println();
		}
	}
}