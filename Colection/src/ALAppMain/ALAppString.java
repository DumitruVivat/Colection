package ALAppMain;

import java.util.ArrayList;
import java.util.Collections;

public class ALAppString {

	public static void main(String[] args) {
		
		 ArrayList<String> devs = new ArrayList<>(); 
		 // 1.<String> it's type of element of ArrayList , which limits us to use just <String> element. 
		 // adding data to the list
		 devs.add("Johny");
		 devs.add("Valerya");
		 devs.add("Tatyana");
		 devs.add("Peter");
		 devs.add("Marry");
		 
		 System.out.println("name: " + devs + "\n");
		 // showing the initials, use "charAt(index)" from "String" class
		 for (String in : devs) {
		 System.out.println("Initial : " + in.charAt(0) + ".");
		}

		 // the longest name, use "length()" from "String" class
		 int maxLength = 0;
		 int index = 0;
	     for(int i =0; i < devs.size(); i++) {
	    	 if(devs.get(i).length() > maxLength) {
	    		 maxLength = devs.get(i).length();
	    		 index = i;
	    	 }
	     }
	     System.out.println("\nIndex " + index + ": " + devs.get(index) + " is the largest name, and this is size: " + maxLength);
		 // swap values
	     System.out.println("\n(after swaping) name: " + devs);
	     //String temp;
	     Collections.swap(devs, 1, 4);
		 
		 System.out.println("\nSwaping index 1 with index 4 :" + devs);
	}

}
