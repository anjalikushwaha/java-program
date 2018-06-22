class Evenodd
{
	public static void main(String args[])
	{
		int a[]={4,2,5,6},temp,i,j;
		for(i=0;i<3;i++)
		{
			for(j=i+1;j<=3;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<=3;i++)
		{
			System.out.println(" "+a[i]);
		}
	}
}