package programtoReverseNumber;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	System.out.println("Enter the number to be Reversed");
	Scanner scan  = new Scanner(System.in);
	int number = scan.nextInt();
	int reverse = 0;
	while(number != 0)
	{
		int digit = number % 10;
		reverse =  reverse * 10+digit;
		number = number / 10;
	}
	System.out.println("Reversed number is"+reverse);
}
}
