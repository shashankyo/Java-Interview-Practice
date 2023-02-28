package decimalToBinary;

import java.util.*;

public class Solution {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner scan  = new Scanner(System.in);

	int n = scan.nextInt();
	int r = 0;
	String str = "";

	while(n > 0)
	{
		r = n % 2;
		n = n / 2;
		str = r + str;
	}
	System.out.println(str);
	
}
}
