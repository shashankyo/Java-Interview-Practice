package countEvenandOddDigitofaNumber;

import java.util.Scanner;

public class EvenOddDigit {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = scan.nextInt();
	
	int evenCount = 0;
	int oddCount = 0;
	while(number > 0)
	{
		int rem = number % 10;
		if(rem % 2 == 0)
		{
			evenCount++;
		}
		else
		{
			oddCount++;
		}
		number = number / 10;
	}
	System.out.println("Even count= "+evenCount);
	System.out.println("Odd count= "+oddCount);
}
}
