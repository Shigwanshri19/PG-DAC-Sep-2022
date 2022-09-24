class Pattern17
{
	public static void main(String args[])
	{
		int a=0; 
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				a++;
				System.out.print(a+" ");
			}			
			System.out.println();
		}
	}
}