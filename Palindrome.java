package seleninumSample;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0, temp;
		int b=252;
		int c=b;
		temp=c;
		while(c>0)
		{
			a=c%10;
			sum=(sum * 10) + a;
			c=c / 10;
		}
		if(temp == sum)
		{
			System.out.println(b + " is a Palindrome Number");
		}
		else
		{
			System.out.println(b + " is not a Palindrome Number");
		}
	}

}
