package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		  List<Integer> lstName =new ArrayList<Integer>();
	        lstName.add(10);
	        lstName.add(30);
	        lstName.add(10);
	        lstName.add(50);
	        lstName.add(40);
	        lstName.add(2, 50);
	        //print list
	        System.out.println(lstName);
	        //count of the list
	        System.out.println(lstName.size());
	        //get particular
	        System.out.println(lstName.get(3));
	        //remove 
	        System.out.println(lstName.remove(3));
	        
	         //lstName.clear();
	        
	         System.out.println(lstName.isEmpty());
	         System.out.println(lstName.contains(60));
	         //arrange my list
	         Collections.sort(lstName);
	         System.out.println(lstName);
	    }
}


	    
	    
	
	
	


	


