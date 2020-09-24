package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class PrimeOrNot {

	public static void main(String[] args) {
		String number;
	number =JOptionPane.showInputDialog("Give me a number");
	 int primeOrNot=Integer.parseInt(number);
	for(int i=2; i< primeOrNot/2;i++) {
		if (primeOrNot% i==0) {
			JOptionPane.showMessageDialog(null, "NoT PrImE");
			System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "It's Prime!");
}
}