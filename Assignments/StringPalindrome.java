package Assignments;

public class StringPalindrome {
	
	 public static void main(String[] args) 
	 {
	   String str = " raceacar";
	   StringBuffer sb = new StringBuffer(str);
	   String rev = sb.reverse().toString();
	   if(rev.equalsIgnoreCase(str))
		System.out.println(str+ " is a palindrome.");
	   else
		System.out.println(str+ " is not a palindrome.");  
	 
	 }
}
