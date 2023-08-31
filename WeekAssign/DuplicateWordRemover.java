package WeekAssign;


	import java.util.Arrays;
	import java.util.stream.Collectors;

	public class DuplicateWordRemover {
	    public static void main(String[] args) {
	        String inputString = "HI Iam Sowmiya Student in TestLeaf Iam Student is Org.";
             String result = removeDuplicateWords(inputString);

	        System.out.println("Removing duplicate words: " + result);
	    }

	    private static String removeDuplicateWords(String inputString) {
	        String[] words = inputString.split("\\s+");

	        
	        String result = Arrays.stream(words)
	                .distinct()
	                .collect(Collectors.joining(" "));

	        return result;
	    }
	}

