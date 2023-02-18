package AlphabetOrNot;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	System.out.println("Enter the letter");
	Scanner scan  = new Scanner(System.in);
	char ch = scan.next().charAt(0);
	if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <='Z'))
	{
		System.out.println("Letter "+ch+" is a alphabet");
	}
	else
	{
		System.out.println("Letter "+ch+" is a not alphabet");

	}
}
}
