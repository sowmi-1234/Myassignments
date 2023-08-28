package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String name="Testleaf";
		int count=0;
		//convert charArray
	char[] charArray = name.toCharArray();
	char str='e';
	for (int i=0;i<charArray.length;i++) {
		
		
		if(name.charAt(i)==str)
			count++;
		}
		System.out.println(count);
		
		}
	
		
	}

	


