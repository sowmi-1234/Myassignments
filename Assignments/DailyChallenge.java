package Assignments;
import java.util.ArrayList;
import java.util.List;
 
public class DailyChallenge {
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
		        String str = "Hello World";
		        System.out.println("The length of last word is " + length(str));
		        String str1 =" fly me   to   the moon";
		        System.out.println("The length of last word is " + length(str1));
		        String str2= "luffy is still joyboy";
		        System.out.println("The length of last word is " + length(str2));
		        
		        		
		    }
		}







	


