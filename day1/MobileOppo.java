package week1.day1;

public class MobileOppo {
	
	public void sendSms()
	{
	  System.out.println("From Oppo");
	}
	public long makeCall(long phno)
	{ 
		return phno;
	}
public static void main(String[] args) {
	MobileOppo obj=new MobileOppo();
	obj.sendSms();
	System.out.println(obj.makeCall(1234567890));
}
	
		

	

}
