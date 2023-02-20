package armstrongNumberofGivenRange;

import java.util.Scanner;

public class ArmstrongApp {
public static void main(String[] args) {
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter the range to display armstrong number");
	int num1  =  scan.nextInt();
	int num2 = scan.nextInt();
	int count = 0;
	for(int i=num1;i<=num2;i++)
	{
		int power = Demo.getCount(i);
		int res = Demo.getSum(i,power);
		if(i == res)
		{
			System.out.println(i+"is armstrong number");
			count++;
		}
	}
	System.out.println("There are "+count+" Armstrong no in the range"+num1+"and"+num2);
}
}
