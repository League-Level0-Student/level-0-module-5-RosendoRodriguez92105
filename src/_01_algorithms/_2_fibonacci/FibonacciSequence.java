package _01_algorithms._2_fibonacci;

public class FibonacciSequence {
public static void main(String[] args) {
	
	int number01= 0;
	int number02= 1;
	int sum;
	 System.out.println(number01);
	 System.out.println(number02);

	for(int i=0; i<11; i++) {
		sum= number01+number02;
		System.out.println(sum);
		number01=number02;
		number02=sum;
	}
	
}
}
