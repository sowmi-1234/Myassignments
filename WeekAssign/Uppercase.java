package WeekAssign;


import java.util.Scanner;
public class Uppercase {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string :");
      String str = sc.nextLine();
      str = str.toLowerCase();
      char[] ch = str.toCharArray();
      for(int i=0; i<ch.length; i=i+1){
         ch[i] = Character.toUpperCase(ch[i]);
      }
      System.out.println(new String(ch));
   }
}


