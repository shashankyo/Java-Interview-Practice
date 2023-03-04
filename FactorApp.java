package factorsofNumber;

import java.util.Scanner;

public class FactorApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to check its factors");
	int num = scan.nextInt();
	Factors.printFactors(num);
}
}
