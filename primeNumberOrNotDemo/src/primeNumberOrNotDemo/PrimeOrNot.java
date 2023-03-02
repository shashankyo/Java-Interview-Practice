package primeNumberOrNotDemo;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	boolean prime = true;
	System.out.println("Enter the number to check prime");
	Scanner scan  = new Scanner(System.in);
	Integer num = scan.nextInt();
	for(int i=2;i<num;i++)
	{
		if(num % i == 0)
		{
			prime = false;
		}
	}
	if(prime == true)
	{
		System.out.println("Given number is Prime");
	}
	else
	{
		System.out.println("Not a Prime number");
	}
}
}
