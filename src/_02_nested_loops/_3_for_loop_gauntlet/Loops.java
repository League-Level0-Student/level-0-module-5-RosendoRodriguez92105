package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class Loops {
public static void main(String[] args) {
	
	for (int i=0;i<101; i++) {
		
	System.out.println(i);
	}
	System.out.println("**********************************************");

	for (int a=100;a>-1; a--) {

		System.out.println(a);
	}
	System.out.println("**********************************************");
	for (int b=2;b<101; b++) {
		if(b%2==0) {
	System.out.println(b);
		}
	}
	System.out.println("**********************************************");
    for(int c=1;c<100; c++) {
    	if (c% 2==1) {
    		System.out.println(c);
    	}
    }
	System.out.println("**********************************************");
    for (int d = 1;d<501; d++) {
    if(d%2 ==0) {
    	System.out.println(d+" is even");
    }
    else {
    	System.out.println(d+" is odd");
    }
    }
	System.out.println("**********************************************");
     
   for(int e = 7;e<778;e++ ) {
	   if(e%7==0) {
		   System.out.println(e);
	   }
   }
	System.out.println("**********************************************");

int end  =2021;
int birthyear =2007;

   for(int start= 1980;start< end; start++) {
	   //int difference = start-i
	  //in year X I was X years old.
	   // in start I was start-birthyear years old
	   System.out.println("in " + start +" I was "+ (start-birthyear )+" years old");
	   
   }
    
    
}
}

