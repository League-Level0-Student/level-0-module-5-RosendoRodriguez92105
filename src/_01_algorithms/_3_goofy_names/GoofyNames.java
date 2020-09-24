package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String name =JOptionPane.showInputDialog("What's your name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(name.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for(int i=0;i<name.length();i++) {
	char letter= name.charAt(i);
	String letterString= String.valueOf(letter);
	if(i%2==0) {
		letterString=letterString.toUpperCase();
	}
	else {
		letterString=letterString.toLowerCase();

	}
goofyName+=letterString;
}
      JOptionPane.showMessageDialog(null, "Your goofy name is "+goofyName);     
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name

	}
}

