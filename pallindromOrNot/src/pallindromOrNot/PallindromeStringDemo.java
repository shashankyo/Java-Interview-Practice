package pallindromOrNot;

import java.util.Scanner;

public class PallindromeStringDemo {
public static void main(String[] args) {
	String reverse  = "";
	System.out.println("Enter the input string");
	Scanner scan  = new Scanner(System.in);
	String s = scan.next();
	for(int i= s.length()-1;i>=0;i--)
	{
		reverse = reverse + s.charAt(i);
	}
	if(s.equals(reverse))
	{
		System.out.println("Given string is pallindrome");
	}
	
	else {
		System.out.println("Not a pallindrome");
	}
}
}
