package week3.day2;

public class ReverseTheString {
	public static void main(String[] args) {
		
	
	String name="Sowmiya";
    //convert string into charArray
    char[] charArray = name.toCharArray();
    //loop 8 to 0
    for (int i = charArray.length-1; i >=0 ; i--) {
        System.out.println(charArray[i]);
    }
}
}

