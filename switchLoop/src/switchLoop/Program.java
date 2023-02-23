package switchLoop;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any no between 1-4");
	int num = scan.nextInt();
	switch(num)
	{
		case 1 : 
			System.out.println("You have ele 1");
			break;
		case 2:
			System.out.println("You have ele 2");
			break;
		case 3:
			System.out.println("You have ele 3");
			break;
		case 4:
			System.out.println("You have ele 4");
			break;
		default:
			System.out.println("Enter proper number");
			break;
	}
}
}
