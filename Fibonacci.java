package fibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
	System.out.println("Enter the number to find Fibbonacci series");
	int count = scan.nextInt();
//	int count = 10;
	int[] fib = new int[count+1];
	fib[0] = 0;
	fib[1] = 1;
	for(int i=2; i<=count;i++)
	{
		fib[i] = fib[i-1]+fib[i-2];
	}
	for(int i:fib)
	{
		System.out.println(i);
	}
}
}
