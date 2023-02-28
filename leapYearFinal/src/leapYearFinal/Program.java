package leapYearFinal;

import java.util.Scanner;

public class Program {
public static void main(String[] args) {
	System.out.println("Enter the year to check leap year");
	Scanner scan = new Scanner(System.in);
	int year = scan.nextInt();
	if(((year%4)==0) &&(year%400==0 || year%100!=0))
	{
		System.out.println(year+""+"is a leap year");
	}else {
		System.out.println(year+""+"is not a leap year");
	}
}
}
