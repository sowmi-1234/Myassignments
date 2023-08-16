package seleninumSample;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=0,prime=0;
		int b=7;
		a=b/2;
		if(b==0||b==1)
		{
			System.out.println(b+" is not Prime Number");
			
		}
		else
		{
		for(i=2;i<=a;i++)
			{
		if(b%i==0)
				{
					System.out.println(b+" is not Prime Number");
					prime=1;
					break;
				}
			}
       if(prime==0)
	{
		          System.out.println(b+ " is Prime Number");
		
	}
		}

	}

}
