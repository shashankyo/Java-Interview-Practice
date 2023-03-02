package firstDigitLastDigitandSum;

import java.util.Scanner;

public class FLSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int LastDigit = n % 10;
		int FirstDigit = n;
		while(FirstDigit >= 10)
		{
			FirstDigit = FirstDigit / 10;
		}
		System.out.println("First digit ="+FirstDigit);
		System.out.println("Last digit ="+LastDigit);
		System.out.println("Sum of Last and First Digit ="+(LastDigit+FirstDigit));
	}
}
