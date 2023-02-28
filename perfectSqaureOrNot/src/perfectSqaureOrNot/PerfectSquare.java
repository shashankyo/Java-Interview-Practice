package perfectSqaureOrNot;

import java.util.Scanner;

public class PerfectSquare {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	Integer num = scan.nextInt();
	for(int i=1;i<num;i++)
	{
		if(i*i == num)
		{
			System.out.println("Given number is a perfect square of "+i);
			return;
		}
	}
}}
