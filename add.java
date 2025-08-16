class main
{
	public static void main(String[]args)
	{
		int y;
		for(y=1;y<=1000;y++)
		{
			int n=y,temp=0,copy=n;
			while(n!=0)
			{
				 temp=temp*10+n%10;
			 	n/=10;
			}
				if(copy==temp)
				{	
					System.out.println(copy+"&"+temp+" "+"is palindrome");
				}
		}

	}
}	