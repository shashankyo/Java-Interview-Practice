package perfectNumber;

import java.util.Scanner;

public class PerfectApp {
public static void main(String[] args) {
	Scanner scan  = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	int res = Perfect.detectPerfect(num);
	if(num == res)
	{
		System.out.println("Entered number "+num+" is a perfect number");
	}
	else {
		System.out.println("Entered number "+num+" is not a perfect number");
	}
}
}
