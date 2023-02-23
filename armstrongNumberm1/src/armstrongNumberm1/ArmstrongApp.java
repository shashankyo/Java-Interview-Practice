package armstrongNumberm1;

import java.util.Scanner;

public class ArmstrongApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scan.nextInt();
	int power = Demo.getCount(num);
	int res = Demo.getSum(num,power);
	if(num == res)
	{
		System.out.println("Entered number " + num +" is a armstrong number");
	}
	else
	{
		System.out.println("Entered number "+num+" is not a armstrong number");
	}
}
}
