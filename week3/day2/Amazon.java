package week3.day2;

public class Amazon {

	public static void main(String[] args) {
		String input="Amazon development centre,Chennai";
		String[] words=input.toLowerCase().split(" ");
		int wordCount=words.length;
		for (int i=wordCount-1;i>=0;i--) {
			System.out.println(words[i]);
			if(i!=0) {
				System.out.print(" ");
			}
		}
		
	}

}
