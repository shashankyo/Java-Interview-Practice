package primeOrNot;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number to check");
	int n  =  scan.nextInt();
	boolean flag = false;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag = true;
		}
	}
	if(!flag)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not a Prime");
	}
}
}
