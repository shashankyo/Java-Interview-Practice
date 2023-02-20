package strongNumberOrNot;

import java.util.Scanner;
public class StrongApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	Strong strong = new Strong();
	boolean res = strong.detectStrong(n);
	if(res == true)
	{
		System.out.println("Entered number "+n+" is a Strong number");
	}
	else
	{
		System.out.println("Entered number "+n+" is not a strong number");
	}
}
}
