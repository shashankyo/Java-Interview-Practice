package reversingStringUsingRecursion;

import java.util.Scanner;

public class StringRecursion {
public static void main(String[] args) {
//	String s = "Sandy";
	System.out.println("Enter the String");
	Scanner scan  = new Scanner(System.in);
	String s =  scan.next();
	System.out.println(recursionString(s));
}
private static String recursionString(String s)
{
	if(s == null || s.length() <= 1)
	{
		return s;
	}
	return recursionString(s.substring(1))+ s.charAt(0);
}
}
