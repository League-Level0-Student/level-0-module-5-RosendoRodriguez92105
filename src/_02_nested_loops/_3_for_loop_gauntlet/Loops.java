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
	System.out.println("**********************************************");

    for(int f=0;f<3;f++) {
        for(int g=0;g<3;g++) {
        	System.out.println(f + ", " + g);
	    }
    }
	System.out.println("**********************************************");
    for(int h=1;h<10;h++) {
    	System.out.print(h+ " ");
        if(h%3==0) {
        	System.out.println();
        }
    }
	System.out.println("**********************************************");
	for(int row=1;row<10;row+=3) {
		for(int col=row;col<row+3;col++) {
			System.out.print(col +" ");
		}
		System.out.println();
	}
	System.out.println("**********************************************");
	//row    //col
	//1 =-> 1 < 11
	//11     11 < 21    
	//21     21 < 31    21 22 23 24... 30
	for(int row=1;row<101;row+=10) {
		for(int col=row;col<row+10; col++) {
			System.out.print(col + " ");
		}
		System.out.println();
	}
	System.out.println("**********************************************");
	for(int i =1; i<7; i++) {
		for(int o=0; o<i;o++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	System.out.println("**********************************************");
	for(int i=0;i>-101;i--) {
	    System.out.println(i + 100);
	}
}
}
//100 = 100 - 0 
//99  = 100 - 1
//98  = 100 - 2
//97  = 3







/**
 * for(int i = 0; i < 3; i++) {
 * 		for(int j = 0; j < 3; j++) { 
 * 		
 * 		}
 * }
 * i = 0, j = 0,
 * i = 0, j = 1,
 * i = 0, j = 2,
 * i = 1, j = 0
 */

