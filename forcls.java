class Main
{
	public static void main(String[]args)
	{
		int y;
		for(y=1000;y>=1;y--)
		{
	 		int n=y,x,count=0;
			for(x=1;x<=n;x++)
			{
				if(n%x==0)
				{
					count++;
				}
			 }
				if(count==2)
				{
					System.out.println("prime number"+n);
				}
		
		}
	}
}
		  	