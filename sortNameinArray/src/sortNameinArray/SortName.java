package sortNameinArray;

import java.util.Scanner;

public class SortName {
public static void main(String[] args) {
	int n;
	String temp;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of name you want to sort");
	n = scan.nextInt();
	String names[] = new String[n];
	System.out.println("Enter all the names");
	for(int i=0;i<=n-1;i++)
	{
		names[i]= scan.next();
		
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(names[i].compareTo(names[j])>0)
			{
				temp = names[i];
				names[i]= names[j];
				names[j] = temp;
			}
		}
	}
	for(String name:names)
	{
		System.out.println("Sorted Array");
		System.out.println(name);
	}
}
}
