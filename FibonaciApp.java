package fibonacciSeriesofFirstNnumbers;

import java.util.Scanner;

public class FibonaciApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to find the fibonacci series");
	int n = scan.nextInt();
	Fibonacci fibo = new Fibonacci();
	fibo.fibonaci(n);
}
}
