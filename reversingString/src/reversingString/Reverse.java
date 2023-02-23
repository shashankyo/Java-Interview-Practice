package reversingString;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner scan =  new Scanner(System.in);
	String sc = scan.next();
	String reverse = "";
	for(int i=sc.length()-1;i>=0;i--)
	{
		reverse = reverse + sc.charAt(i);
	}
	System.out.println("Reversed String is  "+reverse);
}
}
