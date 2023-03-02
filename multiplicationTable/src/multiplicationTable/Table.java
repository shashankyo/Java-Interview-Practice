package multiplicationTable;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	System.out.println("Enter the number to make table");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for(int i=1;i<=20;i++)
	{
		System.out.println(n +"x"+ i+"="+ n*i);
	}
}
}
