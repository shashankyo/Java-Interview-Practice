package automorphicNumber;

import java.util.Scanner;

public class AutoMorphicApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	boolean res = Automorphic.detectAutomorphic(n);
	if(res == true)
	{
		System.out.println("Entered number "+n+" is a Automorphic number");
	}
	else
	{
		System.out.println("Entered number "+n+" is a not Automorphic number");
	}
}
}
