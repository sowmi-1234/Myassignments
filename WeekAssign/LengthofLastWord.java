package WeekAssign;


	import java.util.ArrayList;
	import java.util.List;
	 
	public class LengthofLastWord {
	    public static int length(String str) {
	        
	        List<String> lis = new ArrayList<>();
	        String word = "";
	        for (char c : str.toCharArray()) {
	            if (c == ' ') {
	                lis.add(word);
	                word = "";
	            } else {
	                word += c;
	            }
	        }
	        lis.add(word);
	        return lis.get(lis.size() - 1).length();
	    }
	 
	   
	    public static void main(String[] args) {
	        String str = "luffy is still joyboy";
	        System.out.println("The length of last word is " + length(str));
	    }
	}






